package com.kafka.demo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @KafkaListener(topics = "usa-topic", groupId = "usa-group")
    public void listenToTopic (String receivedMsg){
        System.out.println("insider consumer listen method");
        System.out.println("The message received is: " + receivedMsg);
    }
}
