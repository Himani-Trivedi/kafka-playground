package com.java.v1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    private final KafkaProducerService producerService;

    @Autowired
    public MessageService(KafkaProducerService producerService) {
        this.producerService = producerService;
    }

    public String sendOneMessage(String message) {
        producerService.sendMessage("topic-one", message);
        return "Message sent 1 time to topic-one";
    }

    public String sendFiveMessages(String message) {
        for (int i = 0; i < 5; i++) {
            producerService.sendMessage("topic-five", message + " - count: " + (i + 1));
        }
        return "Message sent 5 times to topic-five";
    }

    public String sendTenMessages(String message) {
        for (int i = 0; i < 10; i++) {
            producerService.sendMessage("topic-ten", message + " - count: " + (i + 1));
        }
        return "Message sent 10 times to topic-ten";
    }
}
