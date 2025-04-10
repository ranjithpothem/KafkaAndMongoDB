package com.example.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class MessageConsumer {


@KafkaListener(topics = "usermessage1", groupId = "user_group")
    public void listToTopic(String message){
System.out.println(message);

}


}
