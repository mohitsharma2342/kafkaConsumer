package com.example.demo.listener;

import org.springframework.stereotype.Service;

import com.example.demo.model.User;

@Service
public class KafkaListener {

    @org.springframework.kafka.annotation.KafkaListener(topics = "KafkaProducer", groupId = "group_id")
    public void consume(String message) {
        System.out.println("Consumed message: " + message);
    }


    @org.springframework.kafka.annotation.KafkaListener(topics = "Kafka_Example_json", groupId = "group_json",
            containerFactory = "userKafkaListenerFactory")
    public void consumeJson(User user) {
        System.out.println("Consumed JSON Message: " + user);
    }
	
}
