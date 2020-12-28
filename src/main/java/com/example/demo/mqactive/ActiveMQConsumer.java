package com.example.demo.mqactive;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ActiveMQConsumer {

    private String str;

    @JmsListener(destination = "superqueue")
    public void getMessage(String message) {
        System.out.println(message);
        str = message;
    }

    public String getStr() {
        return str;
    }
}
