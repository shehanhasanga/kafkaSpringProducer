package com.example.account.cmd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class AccountEventProducer {
    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;
    public void produce(String topic, Command event) {
        this.kafkaTemplate.send(topic, event);
    }
}
