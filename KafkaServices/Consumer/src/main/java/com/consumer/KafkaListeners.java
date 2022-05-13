package com.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "kafkaTopic",groupId = "groupId")
    void listener(String m){
        System.out.println("Listner receive " + m);
    }

}
