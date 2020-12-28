package com.example.demo.mqactive;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ActiveMQConsumer {

    private List<String> list = new ArrayList<>();

    @JmsListener(destination = "superqueue")
    public void getMessage(String message) {
        list.add(message);
    }

    public List<String> getList() {
        return list;
    }
}
