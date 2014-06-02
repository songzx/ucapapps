package com.ucap.ucaptools.email;

import com.ucap.ucaptools.Email;

/**
 * 
 * @Title: EmailUtil.java
 * @Package com.ucap.ucaptools.email
 * @Description: 基于apache commons email 参考:http://commons.apache.org/proper/commons-email/userguide.html
 * URL: http://commons.apache.org/proper/commons-email/userguide.html
   SimpleEmail - This class is used to send basic text based emails.
   MultiPartEmail - This class is used to send multipart messages. This allows a text message with attachments either inline or attached.
   HtmlEmail - This class is used to send HTML formatted emails. It has all of the capabilities as MultiPartEmail allowing attachments to be easily added. It also supports embedded images.
   ImageHtmlEmail - This class is used to send HTML formatted emails with inline images. It has all of the capabilities as HtmlEmail but transform all image references to inline images.
   EmailAttachment - This is a simple container class to allow for easy handling of attachments. It is for use with instances of MultiPartEmail and HtmlEmail.

 * @author 0000
 * @date 2014年6月1日 上午1:58:14
 * @version V1.0
 */
public class EmailUtil implements Email{

	@Override
	public boolean sendsimpleemail(String eamilalise, String tomail, String subject, String content) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean sendhtmlemail(String eamilalise, String tomail, String subject, String content) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean sendemailattachment(String eamilalise, String tomail, String subject, String content) {
		// TODO Auto-generated method stub
		return false;
	}

}
