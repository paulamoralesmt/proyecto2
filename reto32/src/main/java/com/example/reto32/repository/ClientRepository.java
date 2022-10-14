package com.example.reto32.repository;

import com.example.reto32.entities.Client;
import com.example.reto32.repository.CRUDRepository.ClientCRUDRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ClientRepository {

    @Autowired
    private ClientCRUDRepository clientCRUDRepository;

    public List<Client> getAll(){
        return (List<Client>) clientCRUDRepository.findAll();
    }

    public Optional<Client> getClient(int id){
        return clientCRUDRepository.findById(id);
    }

    public Client save(Client p){
        return clientCRUDRepository.save(p);
    }

    public void delete(Client p){
        clientCRUDRepository.delete(p);
    }

}
