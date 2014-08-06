package com.water.monitor.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @Title: MonitorClient.java
 * @Package com.water.monitor.client
 * @Description: TODO
 * @author songzx
 * @date 2014年7月15日 下午2:46:54
 * @version V1.0
 */
public class MonitorClient extends Thread {

	private static Integer count = 0;

	@Override
	public void run() {

		//synchronized (count) {
		/*	if (count % 3 == 0) {
				try {
					this.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("sleep 3000");
			}*/
			try {
				Socket socket = new Socket("192.168.1.166", 54326);
				PrintWriter printWriter = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(),"UTF-8")),true);
				System.out.println("连接已建立...");
				// 发送消息
				printWriter.print("hello Server 中文"+count);
				printWriter.flush();

				
				InputStreamReader streamReader = new InputStreamReader(socket.getInputStream());
				// 链接数据串流，建立BufferedReader来读取，将BufferReader链接到InputStreamReder
				BufferedReader reader = new BufferedReader(streamReader);
				String advice = reader.readLine();
				System.out.println("接收到服务器的消息 ：" + advice);
				reader.close();

			} catch (IOException e1) {
				e1.printStackTrace();
			}
			count++;
			System.out.println(count);
		//}
	}

	public static void main(String[] args) {
		//for (int i = 0; i < 100; i++) {
			new MonitorClient().start();
		//}
	}
}
