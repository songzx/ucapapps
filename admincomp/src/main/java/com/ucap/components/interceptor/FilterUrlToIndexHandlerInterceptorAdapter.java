package com.ucap.components.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * 
 * @Title: FilterUrlToIndexHandlerInterceptorAdapter.java
 * @Package com.ucap.components.interceptor
 * @Description: 若用户登陆后,再访问要登陆的页面的时候,直接跳到首页
 * @author 0000
 * @date 2014年6月2日 下午2:17:12
 * @version V1.0
 */
public class FilterUrlToIndexHandlerInterceptorAdapter extends HandlerInterceptorAdapter {
	private static final Logger LOGGER = LoggerFactory.getLogger(FilterUrlToIndexHandlerInterceptorAdapter.class);

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("方法(METHOD):" + handler);
		}
		if(request.getSession().getAttribute("accountid") != null){
			request.getRequestDispatcher("/restful/admin/index").forward(request, response);
			return true;
		}
		
		
		return super.preHandle(request, response, handler);
	}
}
