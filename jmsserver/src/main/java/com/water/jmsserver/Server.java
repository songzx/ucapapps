package com.water.jmsserver;

import org.apache.activemq.broker.BrokerService;

/**
 * @Title: Server.java
 * @Package com.water.jmsserver
 * @Description: TODO
 * @author 0000
 * @date 2014年8月24日 下午9:35:05
 * @version V1.0
 */
public class Server {

	public static void main(String[] args) throws Exception {
		BrokerService broker = new BrokerService();
		broker.addConnector("tcp://127.0.0.1:61616");
		broker.start();
	}
}
