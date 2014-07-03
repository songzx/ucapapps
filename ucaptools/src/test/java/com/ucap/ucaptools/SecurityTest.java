package com.ucap.ucaptools;

import java.io.IOException;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

import org.junit.Assert;
import org.junit.Test;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import com.ucap.ucaptools.security.Security3DES;

/**
 * @Title: SecurityTest.java
 * @Package com.ucap.ucaptools
 * @Description: TODO
 * @author songzx
 * @date 2014年7月3日 下午1:38:42
 * @version V1.0
 */
public class SecurityTest {

	private String key3des = "ZE9PAbpzQF0+WOXOtiU7Jd+SaEojvEkc";
	private static BASE64Encoder base64Encoder = new BASE64Encoder();
	private static BASE64Decoder base64Decoder = new BASE64Decoder();

	@Test
	public void testencode() {

		String content = "test中文";
		Security security = new Security3DES();
		String enstr = security.encoder(content, key3des);
		Assert.assertNotNull(enstr);
		Assert.assertFalse(content.equals(enstr));

		String destr = security.decoder(enstr, key3des);
		Assert.assertNotNull(destr);
		Assert.assertTrue(content.equals(destr));

	}

	/**
	 * 生成3DES密钥
	 * 
	 * @throws IOException
	 */
	@Test
	public void testdecoder() throws IOException {
		try {
			java.security.Security.addProvider(new com.sun.crypto.provider.SunJCE());
			Cipher cipher = Cipher.getInstance("DESede");

			for (int i = 0; i < 10; i++) {
				KeyGenerator keyGenerator = KeyGenerator.getInstance("DESede");
				SecretKey key = keyGenerator.generateKey();
				System.out.println(base64Encoder.encode(key.getEncoded()));
			}

		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchPaddingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
