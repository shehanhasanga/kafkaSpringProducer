package com.example.account.cmd;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;


//public class AccountEventConsumer {
//
//    @KafkaListener(topics = "customEvent", groupId = "${spring.kafka.consumer.group-id}")
//    public void consume(@Payload KafkaEvent event, Acknowledgment ack) {
//        System.out.println("event received with id :" + event.getId() + " and event name : " + event.getName()) ;
//    }
//}
