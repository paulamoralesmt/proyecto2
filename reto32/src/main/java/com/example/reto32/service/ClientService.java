package com.example.reto32.service;

import com.example.reto32.entities.Category;
import com.example.reto32.entities.Client;
import com.example.reto32.repository.CategoryRepository;
import com.example.reto32.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public List<Client> getAll() {
        return clientRepository.getAll();
    }

    public Optional<Client> getCategory(int id) {
        return clientRepository.getClient(id);
    }

    public Client save(Client p) {
        if (p.getIdClient() == null) {
            return clientRepository.save(p);
        } else {
            Optional<Client> e = clientRepository.getClient(p.getIdClient());
            if (e.isPresent()) {
                return p;
            } else {
                return clientRepository.save(p);
            }
        }
    }

    public Client update(Client p) {
        if (p.getIdClient() != null) {
            Optional<Client> q = clientRepository.getClient(p.getIdClient());
            if (q.isPresent()) {

                if (p.getName() != null) {
                    q.get().setName(p.getName());
                }

                if (p.getEmail() != null) {
                    q.get().setEmail(p.getEmail());
                }

                if (p.getPassword() != null) {
                    q.get().setPassword(p.getPassword());
                }

                if (p.getAge() != null) {
                    q.get().setAge(p.getAge());
                }

                if (p.getCategory() != null) {
                    q.get().setCategory(p.getCategory());
                }

                clientRepository.save(q.get());
                return q.get();
            } else {
                return p;
            }
        } else {
            return p;
        }
    }
    

    public boolean delete(int id){
        boolean flag = false;
        Optional<Client> p = clientRepository.getClient(id);
        if(p.isPresent()){
            clientRepository.delete(p.get());
            flag= true;
        }
        return flag;
    }
}

