package com.ucap.ucaptools.security;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ucap.ucaptools.Security;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

/**
 * @Title: Security3DES.java
 * @Package com.ucap.ucaptools.security
 * @Description: TODO
 * @author songzx
 * @date 2014年7月3日 下午1:29:23
 * @version V1.0
 */
public class Security3DES implements Security {

	private static Logger logger = LoggerFactory.getLogger(Security3DES.class);

	private static BASE64Encoder base64Encoder = new BASE64Encoder();
	private static BASE64Decoder base64Decoder = new BASE64Decoder();

	/**
	 * byte[] --(base64)-> str
	 */
	@Override
	public String encoder(String content, String securitystr) {
		try {
			if ("".equals(content) || null == content) {
				return content;
			}
			java.security.Security.addProvider(new com.sun.crypto.provider.SunJCE());
			Cipher cipher = Cipher.getInstance("DESede");
			

			SecretKeySpec secretKeySpec = new SecretKeySpec(base64Decoder.decodeBuffer(securitystr), "DESede");
			cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);

			// 根据公钥，对Cipher对象进行初始化
			byte[] resultBytes = cipher.doFinal(content.getBytes("UTF-8"));
			return base64Encoder.encode(resultBytes);
		} catch (InvalidKeyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchPaddingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalBlockSizeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BadPaddingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	@Override
	public String decoder(String content, String securitystr) {
		try {
			if ("".equals(content) || null == content) {
				return content;
			}
			java.security.Security.addProvider(new com.sun.crypto.provider.SunJCE());
			Cipher cipher = Cipher.getInstance("DESede");
			SecretKeySpec secretKeySpec = new SecretKeySpec(base64Decoder.decodeBuffer(securitystr), "DESede");
			cipher.init(Cipher.DECRYPT_MODE, secretKeySpec);
			// 根据公钥，对Cipher对象进行初始化
			byte[] resultBytes = cipher.doFinal(base64Decoder.decodeBuffer(content));
			return new String(resultBytes, "UTF-8");
		} catch (InvalidKeyException e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		} catch (NoSuchPaddingException e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		} catch (IllegalBlockSizeException e) {
			logger.error("传进来的参数没有加密：" + e.getMessage());
			e.printStackTrace();
		} catch (BadPaddingException e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		}
		return null;
	}
	
	

}
