package com.example.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Service
public class MessageProducer {
    @Autowired
    private KafkaTemplate<String , Object> kafkaTemplate;

    public void sendMsgToTopic(String message){
        Map<String,String> jsFormate= new HashMap<>();
        jsFormate.put("message",message);
        kafkaTemplate.send("usermessage",jsFormate);
}
}
