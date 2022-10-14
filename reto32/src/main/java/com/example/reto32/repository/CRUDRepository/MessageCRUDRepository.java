package com.example.reto32.repository.CRUDRepository;

import com.example.reto32.entities.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageCRUDRepository extends CrudRepository<Message, Integer> {
}
