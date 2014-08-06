package com.ucap.ucaptools.net;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import net.sf.json.JSONObject;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.params.ClientPNames;
import org.apache.http.client.params.CookiePolicy;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.CoreConnectionPNames;
import org.apache.http.params.CoreProtocolPNames;

import com.ucap.ucaptools.security.MD5Util;

/**
 * @Title: HttpNetUtil.java
 * @Package com.ucap.ucaptools.net
 * @Description: TODO
 * @author songzx
 * @date 2014年7月18日 上午11:29:57
 * @version V1.0
 */
public class HttpNetUtil2 {

	public static void main(String[] args) {
		String url = "http://210.21.65.82/appweb/service/service!handleRequest";
		String result = "";
		try {

			DefaultHttpClient httpClient = new DefaultHttpClient();
			httpClient.getParams().setParameter(CoreConnectionPNames.CONNECTION_TIMEOUT, 10000);
			httpClient.getParams().setParameter(CoreConnectionPNames.SO_TIMEOUT, 10000);
			httpClient.getParams().setParameter(CoreProtocolPNames.USE_EXPECT_CONTINUE, false);
			httpClient.getParams().setParameter(ClientPNames.COOKIE_POLICY, CookiePolicy.BROWSER_COMPATIBILITY);

			HttpPost httpPost = new HttpPost(url);

			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
			NumberFormat numberFormat = new DecimalFormat("0000");
			String requestId = "1" + simpleDateFormat.format(new Date()) + numberFormat.format(new Random().nextInt(10));
			String serviceCode = "QUE_FWZH_PRODUCT";
			int sysMark = 1;
			String md5key = "183F3364ED7564A9F5624DA2421EDEED";

			Map<String, Object> postmap = new HashMap<>();
			postmap.put("sysMark", sysMark);
			postmap.put("dataSign","aaaaa");// MD5Util.getInstance().encoder(requestId + serviceCode + sysMark + md5key));
			postmap.put("serviceCode", serviceCode);
			postmap.put("requestId", requestId);

			Map<String, String> repcontent = new HashMap<>();
			repcontent.put("branchNo", "FS");
			postmap.put("responseContent", repcontent);
			JSONObject jsonObject = JSONObject.fromObject(postmap);
			String json = jsonObject.toString();

			StringEntity stringEntity = new StringEntity(json, "application/json", "UTF-8");
			httpPost.setEntity(stringEntity);

			ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
			httpPost.addHeader("content-type", "application/json");
			HttpResponse httpResponse = httpClient.execute(httpPost);

			if (httpResponse.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
				InputStream inputStream = httpResponse.getEntity().getContent();
				byte bytes[] = new byte[512];
				int i = 0;
				while ((i = inputStream.read(bytes)) != -1) {
					byteArrayOutputStream.write(bytes);
				}
				inputStream.close();
				result = byteArrayOutputStream.toString("UTF-8");
				byteArrayOutputStream.flush();
				byteArrayOutputStream.close();
			}
			if (httpClient != null) {
				httpClient.getConnectionManager().shutdown();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
