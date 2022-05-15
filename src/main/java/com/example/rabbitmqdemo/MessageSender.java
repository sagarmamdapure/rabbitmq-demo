package com.example.rabbitmqdemo;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {
    @Autowired
    private RabbitTemplate template;

    @Autowired
    private Queue queue;

    public void send(int numberOfMessages) {
        for (int i = 0; i < numberOfMessages; i++) {
            String message = "Hello World!";
            this.template.convertAndSend(queue.getName(), message);
        }
        System.out.println(" [x] Sent " + numberOfMessages + " Messages");

    }
}
