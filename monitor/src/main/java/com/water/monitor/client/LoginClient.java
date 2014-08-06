package com.water.monitor.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * 
 * @author Administrator
 * 
 */
public class LoginClient extends Thread {

	private static Integer count = 0;

	@Override
	public void run(){

		// synchronized (count) {
		/*
		 * if (count % 3 == 0) { try { this.sleep(3000); } catch
		 * (InterruptedException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } //System.out.println("sleep 3000"); }
		 */
		try {
			Socket socket = new Socket("210.21.65.82", 36802);
			socket.setTcpNoDelay(true);
			socket.setSoTimeout(1000 * 5);
			InputStream inputStream = socket.getInputStream();
			OutputStream outputStream = socket.getOutputStream();

			// PrintWriter printWriter = new PrintWriter(new BufferedWriter(new
			// OutputStreamWriter(outputStream,"UTF-8")),true);
			System.out.println("连接已建立...");
			// 发送消息
			String s = "<request><clientid>UNPT01</clientid><service>UAP_verifyTicket</service><input><channelcode>1009</channelcode><ticketstr>257BE2D19F01480A01A0AEB083767819B4CCEBF2D5457E9CF9B1B838DB97846DD06572E3D7F5C1C7</ticketstr></input></request>";
			// System.out.println(Integer.toBinaryString(s.getBytes().length));
			NumberFormat numberFormat = new DecimalFormat("00000000");
			String result = numberFormat.format(s.getBytes("UTF-8").length + "00000000".getBytes("UTF-8").length) + s.trim();

			System.out.println(result);
			outputStream.write(result.getBytes("UTF-8"));
			outputStream.flush();
			// printWriter.print(result.getBytes());
			// printWriter.flush();
			
			String tresult = "";
			int available = 1000 * 2;
			long starttime = System.currentTimeMillis();
			while(true){
				if(System.currentTimeMillis() - starttime > available){
					System.out.println("读取信息超时");
					break;
				}
				int size = inputStream.available();
				if(size > 0){
					byte bytes[] = new byte[size];
					inputStream.read(bytes);
					tresult = new String(bytes, "UTF-8");
					break;
				}
			}
			System.out.println(tresult);

			

			// 链接数据串流，建立BufferedReader来读取，将BufferReader链接到InputStreamReder
			// BufferedReader reader = new BufferedReader(new
			// InputStreamReader(inputStream,"UTF-8"));

			// System.out.print("接收到服务器的消息 ：" );
			// reader.close();

		} catch (IOException e1) {
			e1.printStackTrace();
		}
		count++;
		//System.out.println(count);
		// }
	}

	public static byte[] read(InputStream in,String separator) throws IOException, InterruptedException
	  {
		 int bufferSize = 10240;
	    byte[] data = (byte[])null;
	    int bytesToRead = 0;
	    int bytesRead = 0;
	    boolean isend = false;
	    String tmpseparator = separator == null ? "|" : separator;

	    bytesToRead = bufferSize;
	    byte[] receiveBuffer = new byte[bufferSize];
	    long startTime = System.currentTimeMillis();
	    do {
	      System.out.println(in.available());
	    }
	    while (!
	      isend);
	    return data;
	  }

	public static void main(String[] args)  throws Exception{
		// for (int i = 0; i < 100; i++) {
		new LoginClient().start();
		// }
	}
}
