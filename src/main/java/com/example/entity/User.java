package com.example.entity;


//import org.springframework.data.mongodb.core.mapping.Document;

//@Document("user")
public class User {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public User(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "User{" +
                "message='" + message + '\'' +
                '}';
    }
}
