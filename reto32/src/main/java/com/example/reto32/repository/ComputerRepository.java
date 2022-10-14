package com.example.reto32.repository;

import com.example.reto32.entities.Computer;
import com.example.reto32.repository.CRUDRepository.ComputerCRUDRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ComputerRepository {

    @Autowired
    private ComputerCRUDRepository computerCRUDRepository;

    public List<Computer> getAll(){
        return (List<Computer>) computerCRUDRepository.findAll();
    }

    public Optional<Computer> getComputer(int id){
        return computerCRUDRepository.findById(id);
    }

    public Computer save(Computer p){
        return computerCRUDRepository.save(p);
    }

    public void delete(Computer p){
        computerCRUDRepository.delete(p);
    }

}
