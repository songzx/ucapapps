package com.ucap.components.filter;

import java.io.IOException;
import java.sql.Driver;
import java.sql.DriverManager;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.sf.xsshtmlfilter.HTMLFilter;

/**
 * @Title: XssHtmlFilter.java
 * @Package com.ucap.components.filter
 * @Description: TODO
 * @author 0000
 * @date 2014年4月13日 下午9:19:04
 * @version V1.0
 */
public class XssHtmlFilter implements Filter{
	private static final Logger LOGGER = LoggerFactory.getLogger(XssHtmlFilter.class);
	
	private String strfilterurls = null;
	private String strfilterparameters = null;
	private String strfilterfloder = null;

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		strfilterurls = filterConfig.getInitParameter("strfilterurls") == null ? "" : filterConfig.getInitParameter("strfilterurls").trim();
		strfilterfloder = filterConfig.getInitParameter("strfilterfloder") == null ? "" : filterConfig.getInitParameter("strfilterfloder").trim();
		strfilterparameters = filterConfig.getInitParameter("filterparameters") == null ? "" : filterConfig.getInitParameter("filterparameters").trim();
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
		HttpServletResponse response = (HttpServletResponse) res;
		HttpServletRequest request = (HttpServletRequest) req;
		//处理提交方式的方法:只允许GET , POST
		if(!"GET".equalsIgnoreCase(request.getMethod()) && !"POST".equalsIgnoreCase(request.getMethod())){
			response.sendError(403, "禁示访问");
			return;
		}
		
		String accessurl = request.getServletPath().substring(1);
		boolean isfloder = false;
		for(String url : strfilterfloder.split("\\|")){
			isfloder = accessurl.contains(url)?true:false;
			if(isfloder){
				break;
			}
		}
		if (isfloder || strfilterurls.contains(accessurl) || "all".equals(strfilterurls)) {
			System.out.println("|"+request.getParameter("name")+"|");
			chain.doFilter(new UcapHttpServletRequestWrapper(request), response);
			System.out.println("|"+request.getParameter("name")+"|");
			return;
		}
		
		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
