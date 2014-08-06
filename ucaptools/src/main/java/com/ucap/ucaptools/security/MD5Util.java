package com.ucap.ucaptools.security;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

import com.ucap.ucaptools.Security;

/**
 * @Title: SecurityMD5.java
 * @Package com.ucap.ucaptools.security
 * @Description: TODO
 * @author songzx
 * @date 2014年7月3日 下午3:23:17
 * @version V1.0
 */
public class MD5Util {

	private static MD5Util md5Util = null;

	private MD5Util() {
	}

	public static MD5Util getInstance() {
		if (md5Util == null) {
			md5Util = new MD5Util();
		}
		return md5Util;
	}

	public String encoder(String content) {
		String str = "";
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(content.getBytes("UTF-8"));
			byte b[] = md.digest();

			int i;

			StringBuffer buf = new StringBuffer("");
			for (int offset = 0; offset < b.length; offset++) {
				i = b[offset];
				if (i < 0)
					i += 256;
				if (i < 16)
					buf.append("0");
				buf.append(Integer.toHexString(i));
			}
			str = buf.toString();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();

		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return str;
	}

}
