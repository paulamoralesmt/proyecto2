package com.example.reto32.controller;

import com.example.reto32.entities.Reservation;
import com.example.reto32.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Reservation")
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    @GetMapping("/all")
    public List<Reservation> getAll(){
        return reservationService.getAll();
    }

    @ResponseStatus(HttpStatus.CREATED)

    public Reservation save(@RequestBody Reservation p){
        return reservationService.save(p);
    }


}
