package com.ucap.components.controllers.rest;

import java.util.Iterator;
import java.util.Map;

import javax.jms.Connection;
import javax.jms.DeliveryMode;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQTopic;

/**
 * @Title: JmsPublisher.java
 * @Package com.ucap.components.controllers.rest
 * @Description: TODO
 * @author 0000
 * @date 2014年8月24日 下午9:59:29
 * @version V1.0
 */
public abstract class JmsPublisher {
	private String destination;

	public JmsPublisher(String destination) {
		this.destination = destination;
	}

	public abstract void service(Map<String, String> params);

	public abstract boolean isallow(Map<String, String> params);

	public boolean send(Map<String, String> params) throws JMSException {
		String user = "admin";
		String password = "password";
		String host = "127.0.0.1";
		int port = 61616;

		ActiveMQConnectionFactory factory = new ActiveMQConnectionFactory("tcp://" + host + ":" + port);
		Connection connection = factory.createConnection(user, password);
		connection.start();
		Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
		Destination dest = new ActiveMQTopic(destination);
		MessageProducer producer = session.createProducer(dest);
		producer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);
		Message msg = session.createMapMessage();
		
		if (isallow(params)) {
			service(params);
			//TextMessage msg = session.createTextMessage(params.toString());
			for(Iterator<String> it = params.keySet().iterator();it.hasNext();){
				String key = it.next();
				msg.setStringProperty(key, params.get(key));
			}
			producer.send(msg);
		}
		connection.close();
		// 如何判断数据已传输完及返回处理结果
		return true;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

}
