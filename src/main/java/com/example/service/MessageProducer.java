package com.example.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class MessageProducer {
    @Autowired
    private KafkaTemplate<String , Object> kafkaTemplate;

    public void sendMsgToTopic(String message,String name,String location){

        Thread.startVirtualThread(()->{
        Map<String,String> jsFormate= new HashMap<>();
        jsFormate.put("message",message);
        jsFormate.put("name",name);
        jsFormate.put("location",location);
        kafkaTemplate.send("usermessage1",jsFormate);
        });
}
}
