package com.ucap.ucaptools.net;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.CoreConnectionPNames;
import org.apache.http.params.CoreProtocolPNames;

import com.ucap.ucaptools.NetUtil;
import com.ucap.ucaptools.security.MD5Util;

/**
 * @Title: HttpNetUtil.java
 * @Package com.ucap.ucaptools.net
 * @Description: TODO
 * @author songzx
 * @date 2014年7月18日 上午11:29:57
 * @version V1.0
 */
public class HttpNetUtil implements NetUtil {
	private static HttpNetUtil httpNetUtil;
	private static DefaultHttpClient httpClient = null;

	private HttpNetUtil() {
	}

	public static HttpNetUtil getInstance() {
		if (httpNetUtil == null) {
			httpNetUtil = new HttpNetUtil();
			httpClient = getHttpClient();
		}
		return httpNetUtil;
	}

	private static DefaultHttpClient getHttpClient() {
		DefaultHttpClient httpClient = new DefaultHttpClient();
		// 连接超时
		httpClient.getParams().setParameter(CoreConnectionPNames.CONNECTION_TIMEOUT, 10000);
		// 请求超时
		httpClient.getParams().setParameter(CoreConnectionPNames.SO_TIMEOUT, 10000);
		httpClient.getParams().setParameter(CoreProtocolPNames.USE_EXPECT_CONTINUE, false);

		return httpClient;
	}

	@Override
	public String submitget(String url, Map<String, String> params) {
		String result = "";
		try {

			HttpGet httpGet = new HttpGet(url);
			for (Iterator<String> it = params.keySet().iterator(); it.hasNext();) {
				String key = it.next();
				httpGet.getParams().setParameter(key, params.get(key));
			}

			ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
			HttpResponse httpResponse = httpClient.execute(httpGet);
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

		return result;
	}

	@Override
	public String submitpost(String url, Map<String, String> params) {
		String result = "";
		try {

			HttpPost httpPost = new HttpPost(url);
			
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
			NumberFormat numberFormat = new DecimalFormat("0000");
			String requestId = "5"+simpleDateFormat.format(new Date())+numberFormat.format(new Random().nextInt(10));
			String serviceCode = "QUE_YWTJ_PRODUCT";
			int sysMark = 5;
			String md5key = "183F3364ED7564A9F5624DA2421EDEED";
			
			Map<String,Object> postmap = new HashMap<>();
			postmap.put("sysMark", sysMark);
			postmap.put("dataSign",MD5Util.getInstance().encoder(requestId+serviceCode+sysMark+md5key));
			postmap.put("serviceCode", serviceCode);
			postmap.put("requestId", requestId);
			
			Map<String, String> repcontent = new HashMap<>();
			repcontent.put("branchNo", "FS");
			postmap.put("responseContent", repcontent);
			JSONObject jsonObject = JSONObject.fromObject(postmap);
			String json = jsonObject.toString();
			
			
			StringEntity stringEntity = new StringEntity(json, "UTF-8");
			httpPost.setEntity(stringEntity);

			ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
			httpPost.setHeader("Content-Type", "application/json");
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

		return result;
	}

	public static void main(String[] args) {
		//String str = HttpNetUtil.getInstance().submitget("http://www.baidu.com", new HashMap<String, String>());
		//System.out.println(str);
		
		String strpost = HttpNetUtil.getInstance().submitpost("http://210.21.65.82/appweb/service/service!handleRequest", null);
		System.out.println(strpost);
	}

}
