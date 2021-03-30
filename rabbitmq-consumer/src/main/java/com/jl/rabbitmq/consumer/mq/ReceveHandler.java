package com.jl.rabbitmq.consumer.mq;

import com.jl.rabbitmq.consumer.config.RabbitConfig;
import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class ReceveHandler {
    @RabbitListener(queues = {RabbitConfig.QUEUE_INFORM_EMAIL})
    public void send_email(String msg, Message message, Channel channel) {
        System.out.println("接受消息：" + msg);
    }

}
