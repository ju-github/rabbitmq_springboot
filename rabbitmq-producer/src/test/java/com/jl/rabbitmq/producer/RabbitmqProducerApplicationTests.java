package com.jl.rabbitmq.producer;

import com.jl.rabbitmq.producer.config.RabbitConfig;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class RabbitmqProducerApplicationTests {

    @Autowired
    RabbitTemplate rabbitTemplate;
    @Test
    public void testSendTemplateEmail(){

        String message = "send email message";
        /**
         * 1.交换机名称
         * 2.routingkey
         *
         * */
        rabbitTemplate.convertAndSend(RabbitConfig.EXCHANGE_TOPICS_INFORM,"inform.email",message);

    }

}
