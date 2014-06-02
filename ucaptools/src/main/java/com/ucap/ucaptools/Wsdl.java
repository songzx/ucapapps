package com.ucap.ucaptools;

import java.lang.reflect.Method;

import org.apache.cxf.endpoint.Client;

/**
 * @Title: Wsdl.java
 * @Package com.ucap.ucaptools
 * @Description: 调用wsdl工具包,基于CXF
 * @author 0000
 * @date 2014年6月1日 上午2:10:39
 * @version V1.0
 */
public interface Wsdl {

	/**
	 * 首次获取client的初始webservice客户端
	 * 
	 * @param wsdlalise
	 * @return
	 */
	Client getClient(String wsdlalise);

	/**
	 * 获取wsdl url的所有方法
	 * 
	 * @param wsdlalise
	 * @return
	 */
	Method[] getMethod(String wsdlalise);

	/**
	 * 返回字符串值
	 * 
	 * @param wsdlalise
	 * @param method
	 * @param parms
	 * @return
	 */
	String getVal(String wsdlalise, String method,Object[] parms);

	/**
	 * 返回对象
	 * 
	 * @param wsdlalise
	 * @param method
	 * @param parms 
	 * @return
	 */
	Object getObject(String wsdlalise, String method,Object[] parms);

	/**
	 * 处理返回对象,List,Map,待整合系统的对象
	 * 
	 * @return
	 */
	Object executeObject();
}
