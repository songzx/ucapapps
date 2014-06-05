package com.ucap.components.filter;

import java.net.URLDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

import org.slf4j.LoggerFactory;

import net.sf.xsshtmlfilter.HTMLFilter;

/**
 * @Title: UcapHttpServletRequestWrapper.java
 * @Package com.ucap.components.filter
 * @Description: TODO
 * @author 0000
 * @date 2014年5月13日 下午3:36:59
 * @version V1.0
 */
public class UcapHttpServletRequestWrapper extends HttpServletRequestWrapper {
	private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(UcapHttpServletRequestWrapper.class);
	
	private static final Pattern P_AMP = Pattern.compile("&");
	private static final Pattern P_QUOTE = Pattern.compile("\"");
	private static final Pattern P_APOSTROPHE = Pattern.compile("'");
	private static final Pattern P_DATAFORMATE = Pattern.compile("^[0-9]{2,4}-[0-9]{1,2}-[0-9]{1,2}$");
	private static final Pattern P_NUMBER = Pattern.compile("^-*[0-9]+$");
	private static final Pattern P_URLENCODE = Pattern.compile("%[0-9]{1}[a-z]{1}");
	
	private static final Pattern P_LEFT_ARROW = Pattern.compile("<");
	private static final Pattern P_RIGHT_ARROW = Pattern.compile(">");
	private static final Pattern P_BOTH_ARROWS = Pattern.compile("<>");
	private static final Pattern P_EQUALS = Pattern.compile("\\=");
	private static final Pattern P_MINUES = Pattern.compile("\\-");
	private static final Pattern P_PLUS  = Pattern.compile("\\+");
	private static final Pattern P_LEFTPARENTHESIS = Pattern.compile("\\(");
	private static final Pattern P_RIGHTPARENTHESIS  = Pattern.compile("\\)");
	private static final Pattern P_VERTICALBAR  = Pattern.compile("\\|");
	private static final Pattern P_LEFTSQUAREBRACKET  = Pattern.compile("\\[");
	private static final Pattern P_RIGHTSQUAREBRACKET  = Pattern.compile("\\]");

	public UcapHttpServletRequestWrapper(HttpServletRequest request) {
		super(request);
	}

	@Override
	public String getParameter(String name) {
		String val = super.getParameter(name);
		if (val == null || "".equals(val.trim())) {
			return null;
		}
		if (val.trim().length() <= 2048) {
			try {
				StringBuffer sb = new StringBuffer();
				Matcher matcher = P_URLENCODE.matcher(val);
				 int index = 0;
				 while(matcher.find()){
					 sb.append(val.subSequence(index, matcher.start()));
					 sb.append(URLDecoder.decode(matcher.group(),"UTF-8"));
					 index = matcher.end();
				 }
				 sb.append(val.substring(index));
				 
				 val = sb.toString();
			} catch (Exception e) {
				e.printStackTrace();
			}
			val = new HTMLFilter(true).filter(val);
			val = dencode(val);
		} else {
			LOGGER.info("输入的参数过长:" + val);
			val = null;
		}
		return val;
	}

	public String dencode(String val) {
		//'1','2','3'如果识别
		if(P_DATAFORMATE.matcher(val).find() || P_NUMBER.matcher(val).find()){
			return val;
		}
		
		
		
		
		val = P_AMP.matcher(val).replaceAll("&amp;");
		val = P_QUOTE.matcher(val).replaceAll("&quot;");
		val = P_APOSTROPHE.matcher(val).replaceAll("&apos;");
		val = P_LEFT_ARROW.matcher(val).replaceAll("&lt;");
		val = P_RIGHT_ARROW.matcher(val).replaceAll("&gt;");
		val = P_BOTH_ARROWS.matcher(val).replaceAll("&lt;&gt;");
		val = P_MINUES.matcher(val).replaceAll("&#45;");
		val = P_EQUALS.matcher(val).replaceAll("&#61;");
		val = P_PLUS.matcher(val).replaceAll("&#43;");
		val = P_LEFTPARENTHESIS.matcher(val).replaceAll("&#40;");
		val = P_RIGHTPARENTHESIS.matcher(val).replaceAll("&#41;");
		val = P_VERTICALBAR.matcher(val).replaceAll("&#124;");
		val = P_LEFTSQUAREBRACKET.matcher(val).replaceAll("&#91;");
		val = P_RIGHTSQUAREBRACKET.matcher(val).replaceAll("&#93;");
		return val;
	}
	
	

	@Override
	public String[] getParameterValues(String name) {
		String strs[] = super.getParameterValues(name);
		if (strs == null) {
			return null;
		}
		for (int i = 0; i < strs.length; i++) {
			if (strs[i].trim().length() <= 2048) {
				// return new HTMLFilter(true).filter(val);
				strs[i] = new HTMLFilter(false).filter(strs[i]);
				strs[i] = dencode(strs[i]);
			} else {
				LOGGER.info("输入的参数过长:" + strs[i]);
				strs[i] = null;
			}

		}
		return strs;
	}
}
