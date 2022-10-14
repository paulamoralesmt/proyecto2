package com.example.reto32.repository;

import com.example.reto32.entities.Message;
import com.example.reto32.entities.Reservation;
import com.example.reto32.repository.CRUDRepository.MessageCRUDRepository;
import com.example.reto32.repository.CRUDRepository.ReservationCRUDRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class MessageRepository {

    @Autowired
    private MessageCRUDRepository messageCRUDRepository;

    public List<Message> getAll(){
        return (List<Message>) messageCRUDRepository.findAll();
    }

    public Optional<Message> getMessage(int id){
        return messageCRUDRepository.findById(id);
    }

    public Message save(Message p){
        return messageCRUDRepository.save(p);
    }

    public void delete(Message p){
        messageCRUDRepository.delete(p);
    }

}
