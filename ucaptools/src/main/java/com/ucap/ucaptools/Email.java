package com.ucap.ucaptools;

/**
 * @Title: Email.java
 * @Package com.ucap.ucaptools
 * @Description: TODO
 * @author 0000
 * @date 2014年6月1日 上午2:00:27
 * @version V1.0
 */
public interface Email {

	/**
	 * @param eamilalise
	 *            邮件别名,由email.properties获取
	 * @param tomail
	 *            发送多邮件用" , "区分
	 * @param subject
	 * @param content
	 * @return
	 */
	boolean sendsimpleemail(String eamilalise, String tomail, String subject, String content);

	/**
	 * 发送html邮件,包含内置的图片
	 * 
	 * @param eamilalise
	 *            邮件别名,由email.properties获取
	 * @param subject
	 * @param tomail
	 * @param content
	 * @return
	 */
	boolean sendhtmlemail(String eamilalise, String tomail, String subject, String content);

	/**
	 * 发送包含附件的邮件
	 * 
	 * @param eamilalise
	 *            邮件别名,由email.properties获取
	 * @param subject
	 * @param tomail
	 * @param content
	 * @return
	 */
	boolean sendemailattachment(String eamilalise, String tomail, String subject, String content);
}
