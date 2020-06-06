package org.springboot.blog.project.rabbit.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * rabbitMq消费者 -- 监听
 *
 */
@SpringBootApplication
public class RabbitMqApplication 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(RabbitMqApplication.class, args);
     }
}
