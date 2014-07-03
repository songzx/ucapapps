package com.ucap.ucaptools;

/**
 * @Title: Security.java
 * @Package com.ucap.ucaptools
 * @Description: TODO
 * @author songzx
 * @date 2014年7月3日 下午1:27:17
 * @version V1.0
 */
public interface Security {

	/**
	 * 加密
	 * 
	 * @param content
	 * @param securitystr
	 */
	public String encoder(String content, String securitystr);

	/**
	 * 解密
	 * 
	 * @param content
	 * @param securitystr
	 */
	public String decoder(String content, String securitystr);
}
