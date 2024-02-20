package com.example.jpatest.app;

import com.example.jpatest.app.repository.MessageRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class Controller {
    MessageRepository repository;
    public Controller(MessageRepository repository) {
        this.repository = repository;
    }
    @PostConstruct
    void showEntries() {
        try {
            repository.findAll().forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
