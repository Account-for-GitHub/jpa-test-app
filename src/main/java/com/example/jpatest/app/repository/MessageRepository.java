package com.example.jpatest.app.repository;

import com.example.jpatest.app.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepository extends CrudRepository<Message, String> {
}
