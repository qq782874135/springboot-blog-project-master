package org.springboot.blog.project.blogs.constant;

public class MqConstants {
    public static final Integer DELIVERING = 0;//消息投递中
    public static final Integer SUCCESS = 1;//消息投递成功
    public static final Integer FAILURE = 2;//消息投递失败
    public static final Integer MAX_TRY_COUNT = 3;//最大重试次数
    public static final Integer MSG_TIMEOUT = 1;//消息超时时间
    public static final String MAIL_QUEUE_NAME = "ywy.rabbit.mq.queue";
    public static final String MAIL_EXCHANGE_NAME = "ywy.rabbit.mq.exchange";
    public static final String MAIL_ROUTING_KEY_NAME = "ywy.rabbit.mq.routing.key";
}
