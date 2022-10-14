package com.example.reto32.repository;

import com.example.reto32.entities.Reservation;
import com.example.reto32.repository.CRUDRepository.ReservationCRUDRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ReservationRepository {

    @Autowired
    private ReservationCRUDRepository reservationCRUDRepository;

    public List<Reservation> getAll(){
        return (List<Reservation>) reservationCRUDRepository.findAll();
    }

    public Optional<Reservation> getReservation(int id){
        return reservationCRUDRepository.findById(id);
    }

    public Reservation save(Reservation p){
        return reservationCRUDRepository.save(p);
    }

    public void delete(Reservation p){
        reservationCRUDRepository.delete(p);
    }

}
