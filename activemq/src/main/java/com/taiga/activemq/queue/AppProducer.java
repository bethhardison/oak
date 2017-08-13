package com.taiga.activemq.queue;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

/**
 * Created by CJW on 2017/8/12.
 */
public class AppProducer {

  private static final String url = "tcp://localhost:61616";
  private static final String queueName = "queue-test";

  public static void main(String[] args) throws JMSException {
    ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(url);

    Connection connection = connectionFactory.createConnection();

    connection.start();

    Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

    //创建一个目标
    Destination destination = session.createQueue(queueName);

    //创建一个生产者
    MessageProducer producer = session.createProducer(destination);

    for (int i = 0; i < 100; i++) {
      TextMessage textMessage = session.createTextMessage("test" + i);
      producer.send(textMessage);
      System.err.println("发生消息" + textMessage.getText());
    }

    //关闭连接
    connection.close();
  }
}
