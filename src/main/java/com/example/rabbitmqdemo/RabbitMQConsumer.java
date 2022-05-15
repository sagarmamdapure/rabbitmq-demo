package com.example.rabbitmqdemo;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQConsumer {
/*    @RabbitListener(queues = "${queue.name}")
    public void receivedMessage(String message)
    {
        System.out.println("Received message from RabbitMQ: " + message);
    }*/
}
