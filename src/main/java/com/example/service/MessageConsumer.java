package com.example.service;


import com.example.entity.User;
//import com.example.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class MessageConsumer {

//    @Autowired
//    private UserRepo userRepo;

@KafkaListener(topics = "usermessage", groupId = "user_group")
    public void listToTopic(String message){
System.out.println(message);

}


}
