package com.example.controller;


import com.example.service.MessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;

@RestController
@RequestMapping("/user")
public class UserController {
@Autowired
private MessageProducer messageProducer;

    @GetMapping("/userSending")
    public void getMessageFromClient(@RequestParam("message") String message,@RequestParam("name") String name,@RequestParam("location") String location){
       messageProducer.sendMsgToTopic(message,name,location);
    }
}
