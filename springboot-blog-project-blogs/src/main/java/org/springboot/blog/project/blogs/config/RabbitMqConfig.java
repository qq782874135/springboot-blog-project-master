package org.springboot.blog.project.blogs.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springboot.blog.project.blogs.constant.MqConstants;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqConfig {

	private static final Logger logger = LoggerFactory.getLogger(RabbitMqConfig.class);

	CachingConnectionFactory cachingConnectionFactory;

	@Bean
	RabbitTemplate rabbitTemplate() {
		RabbitTemplate rabbitTemplate = new RabbitTemplate(cachingConnectionFactory);
		rabbitTemplate.setConfirmCallback((data, ack, cause) -> {
			String msgId = data.getId();
			if (ack) {
				logger.info(msgId + ":消息发送成功");
			} else {
				logger.info(msgId + ":消息发送失败");
			}
		});
		rabbitTemplate.setReturnCallback((msg, repCode, repText, exchange, routingkey) -> {
			logger.info("消息发送失败");
		});
		return rabbitTemplate;
	}

	@Bean
	Queue blogQueue() {
		return new Queue(MqConstants.MAIL_QUEUE_NAME, true);
	}

	@Bean
	DirectExchange blogExchange() {
		return new DirectExchange(MqConstants.MAIL_EXCHANGE_NAME, true, false);
	}

	@Bean
	Binding mailBinding() {
		return BindingBuilder.bind(blogQueue()).to(blogExchange()).with(MqConstants.MAIL_ROUTING_KEY_NAME);
	}
}
