package com.taiga.activemq.topic;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageListener;
import javax.jms.Session;
import javax.jms.TextMessage;

/**
 * Created by CJW on 2017/8/12.
 */
public class TopicConsumer {

  private static final String url = "tcp://localhost:61616";
  private static final String topicName = "topic-test";

  public static void main(String[] args) throws JMSException {
    ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(url);

    Connection connection = connectionFactory.createConnection();

    //启动连接
    connection.start();

    //创建会话
    Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

    //创建一个目标
    Destination destination = session.createTopic(topicName);

    //创建一个生产者
    MessageConsumer consumer = session.createConsumer(destination);

    //创建一个监听器
    consumer.setMessageListener(new MessageListener() {
      @Override
      public void onMessage(Message message) {
        TextMessage textMessage = (TextMessage) message;
        try {
          System.err.println("接收消息" + textMessage.getText());
        } catch (JMSException e) {
          e.printStackTrace();
        }
      }
    });

    //关闭连接
    //connection.close();
  }

}
