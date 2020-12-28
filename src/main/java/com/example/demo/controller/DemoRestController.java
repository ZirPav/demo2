package com.example.demo.controller;

import com.example.demo.mqactive.ActiveMQConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

    @Autowired
    private ActiveMQConsumer activeMQConsumer;

    @GetMapping("/demo2")
    public String getDemoString() {
        return "Это DEMO2!";
    }

    @GetMapping("/activemq")
    public String getStr() {
        return activeMQConsumer.getList().remove(0);
    }
}
