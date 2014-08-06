package com.ucap.ucaptools;

import java.util.Map;

/**
 * @Title: NetUtil.java
 * @Package com.ucap.ucaptools
 * @Description: 访问地址与提交
 * @author songzx
 * @date 2014年7月18日 上午11:24:19
 * @version V1.0
 */
public interface NetUtil {

	/**
	 * get方式提交
	 * 
	 * @param url
	 * @param params
	 * @return
	 */
	public String submitget(String url, Map<String, String> params);

	/**
	 * post方式提交
	 * 
	 * @param url
	 * @param params
	 * @return
	 */
	public String submitpost(String url, Map<String, String> params);
	
}
