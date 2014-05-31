package com.ucap.components.filter;

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
	
	public UcapHttpServletRequestWrapper(HttpServletRequest request) {
		super(request);
	}


	@Override
	public String getParameter(String name) {
		String val = super.getParameter(name);
		if (val == null || "".equals(val)) {
			return null;
		}
		if (val.trim().length() <= 2048) {
			return new HTMLFilter(true).filter(val);
		} else {
			LOGGER.info("输入的参数过长:" + val);
			return null;
		}
	}

	@Override
	public String[] getParameterValues(String name) {
		String strs[] = super.getParameterValues(name);
		if (strs == null ) {
			return null;
		}
		for (int i = 0; i < strs.length; i++) {
			if (strs[i].trim().length() <= 2048) {
				// return new HTMLFilter(true).filter(val);
				strs[i] = new HTMLFilter(true).filter(strs[i]);
			} else {
				LOGGER.info("输入的参数过长:" + strs[i]);
				strs[i] = null;
			}

		}
		return strs;
	}
}
