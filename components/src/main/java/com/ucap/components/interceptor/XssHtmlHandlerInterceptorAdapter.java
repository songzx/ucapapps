package com.ucap.components.interceptor;

import java.util.Map;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.ucap.components.filter.UcapHttpServletRequestWrapper;

/**   
 * @Title: XssHtmlHandlerInterceptorAdapter.java 
 * @Package com.ucap.components.interceptor 
 * @Description: Xss拦截器,待思考,可以做在类型转换器那 
 * @author songzx
 * @date 2014年6月4日 下午3:50:37 
 * @version V1.0   
 */
public class XssHtmlHandlerInterceptorAdapter extends HandlerInterceptorAdapter {

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
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
		super.postHandle(new UcapHttpServletRequestWrapper(request), response, handler, modelAndView);
	}
	
	private String dencode(String val) {
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
	

}
