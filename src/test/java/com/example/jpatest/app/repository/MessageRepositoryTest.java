package com.example.jpatest.app.repository;

import com.example.jpatest.app.Message;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class MessageRepositoryTest {
    @Autowired
    MessageRepository repository;
    Message message1;
    Message message2;

    @BeforeEach
    void setUp() {
        message1 = new Message("Message 1");
        message2 = new Message("Message 2");
        repository.saveAll(List.of(message1, message2));
    }

    @Test
    void testFindEntries() {
        String message1Id = message1.getId();
        String message2Id = message2.getId();
        assertTrue(repository.existsById(message1Id));
        assertTrue(repository.existsById(message2Id));
    }

    @AfterEach
    void tearDown() {
    }
}