package com.example.rabbitmqdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private MessageSender messageSender;

    @GetMapping("/{id}")
    public String send(@PathVariable("id") int numberOfMessages){
        messageSender.send(numberOfMessages);
        return "ok.done";
    }
}
