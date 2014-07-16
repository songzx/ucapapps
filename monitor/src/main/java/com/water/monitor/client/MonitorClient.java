package com.water.monitor.client;

/**
 * @Title: MonitorClient.java
 * @Package com.water.monitor.client
 * @Description: TODO
 * @author songzx
 * @date 2014年7月15日 下午2:46:54
 * @version V1.0
 */
public class MonitorClient extends Thread {

	private static Integer count  = 0;
	
	@Override
	public void run() {
		synchronized (count) {
			if(count % 3 == 0){
				try {
					this.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("sleep 3000");
			}
			count ++;
			System.out.println(count);
		}
		
	}

	public static void main(String[] args) {
		for(int i =0 ; i < 100; i++){
			new MonitorClient().start();
		}
	}
}
