package com.skcc.college.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import org.springframework.context.annotation.Profile;


@Service
@Profile("consumer")
public class KafkaConsumer {

    @KafkaListener(topics = "test_topic", groupId = "test-group")
    public void listen(String message) {
        System.out.println("Received message: " + message);
    }
}
