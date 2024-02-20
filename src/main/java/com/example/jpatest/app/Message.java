package com.example.jpatest.app;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;


@Entity
public class Message {
    @Id
    @UuidGenerator
    String id;
    String message;
    public Message() {
    }

    public Message(String message) {
        this.id = UUID.randomUUID().toString();
        this.message = message;
    }

    public String getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
