package com.water.servcie.crud;

import java.util.Enumeration;

import javax.jms.Connection;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQMapMessage;
import org.apache.activemq.command.ActiveMQTopic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Title: CrudService.java
 * @Package com.water.servcie
 * @Description: TODO
 * @author 0000
 * @date 2014年8月24日 下午9:44:02
 * @version V1.0
 */
public class CrudService {
	private static Logger logger = LoggerFactory.getLogger(CrudService.class);

	public static void main(String[] args) throws JMSException {

		String user = "admin";
		String password = "password";
		String host = "127.0.0.1";
		int port = 61616;
		String destination = "crudevent";

		ActiveMQConnectionFactory factory = new ActiveMQConnectionFactory("tcp://" + host + ":" + port);

		Connection connection = factory.createConnection(user, password);
		connection.start();
		Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
		Destination dest = new ActiveMQTopic(destination);
		
		
		MessageConsumer consumer = session.createConsumer(dest);
		long start = System.currentTimeMillis();
		long count = 1;
		System.out.println("CRUD Waiting for messages...");
		while (true) {
			Message msg = consumer.receive();
			if (msg instanceof TextMessage) {
				String body = ((TextMessage) msg).getText();
				if ("SHUTDOWN".equals(body)) {
					long diff = System.currentTimeMillis() - start;
					System.out.println(String.format("Received %d in %.2f seconds", count, (1.0 * diff / 1000.0)));
					break;
				} else {
					if (count != msg.getIntProperty("id")) {
						System.out.println("mismatch: " + count + "!=" + msg.getIntProperty("id"));
					}
					count = msg.getIntProperty("id");

					if (count == 0) {
						start = System.currentTimeMillis();
					}
					if (count % 1000 == 0) {
						System.out.println(String.format("Received %d messages.", count));
					}
					count++;
				}

			}else if(msg instanceof ActiveMQMapMessage){
				Enumeration<String> e =  msg.getPropertyNames();
				while(e.hasMoreElements()){
					String key = e.nextElement();
					System.out.format("key:%s,value:%s \n",key,msg.getStringProperty(key));
				}
			}else {
				System.out.println("Unexpected message type: " + msg.getClass());
			}
		}
		connection.close();
	}
}
