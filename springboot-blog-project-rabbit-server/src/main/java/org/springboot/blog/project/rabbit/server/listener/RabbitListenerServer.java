package org.springboot.blog.project.rabbit.server.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springboot.blog.project.blogs.constant.MqConstants;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/*
 * 收到消息以后发送短信
 */

@Component
@RabbitListener(queues =MqConstants.MAIL_QUEUE_NAME)
public class RabbitListenerServer {
	
	
	private static final Logger log = LoggerFactory.getLogger(RabbitListenerServer.class);
	
	@RabbitHandler
	public void receive(Message message) {
		log.info("接受到队列信息："+message.toString());
		System.out.println("接受到队列信息："+message.toString());
	}
}
