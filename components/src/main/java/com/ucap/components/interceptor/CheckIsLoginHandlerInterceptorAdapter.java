package com.ucap.components.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * 
 * @Title: CheckIsLoginHandlerInterceptorAdapter.java
 * @Package com.ucap.components.interceptor
 * @Description: 登陆验证
 * @author 0000
 * @date 2014年6月1日 下午9:08:56
 * @version V1.0
 */
public class CheckIsLoginHandlerInterceptorAdapter extends HandlerInterceptorAdapter {
	private static final Logger LOGGER = LoggerFactory.getLogger(CheckIsLoginHandlerInterceptorAdapter.class);

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("方法(METHOD):" + handler);
		}
		if(request.getSession().getAttribute("accountid") == null){
			request.getRequestDispatcher("/restful/web/login").forward(request, response);
			return false;
		}
		
		
		return super.preHandle(request, response, handler);
	}
}
