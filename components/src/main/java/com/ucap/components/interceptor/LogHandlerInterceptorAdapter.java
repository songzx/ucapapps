package com.ucap.components.interceptor;

import java.util.Arrays;
import java.util.Enumeration;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;


/**
 * 日志处理
 * 
 * @author Administrator
 * 
 */
public class LogHandlerInterceptorAdapter extends HandlerInterceptorAdapter {
	private static final Logger LOGGER = LoggerFactory.getLogger(LogHandlerInterceptorAdapter.class);
	private static final int VALUE_LENGTH = 1024;
	private int valuelength ;

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		if(LOGGER.isDebugEnabled()){
			LOGGER.debug("方法(METHOD):"+handler);
		}
		Enumeration<String> e = request.getParameterNames();
		String name = null;
		while(e.hasMoreElements()){
			name = e.nextElement();
			if(LOGGER.isDebugEnabled()){
				LOGGER.debug("输入参数(parameter): "+name+"="+Arrays.toString(request.getParameterValues(name)));
			}
			String strs[] = request.getParameterValues(name);
			for(String ss : strs){
				if(ss.length() > getValuelength()){
					LOGGER.error("输入的参数值过长: "+name+"="+ss);
					return false;
				}
			}
		}
		return super.preHandle(request, response, handler);
	}
	
	public int getValuelength() {
		if(valuelength == 0){
			valuelength = VALUE_LENGTH;
		}
		return valuelength;
	}


	public void setValuelength(int valuelength) {
		this.valuelength = valuelength;
	}



}
