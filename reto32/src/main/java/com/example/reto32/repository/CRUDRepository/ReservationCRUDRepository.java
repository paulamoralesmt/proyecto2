package com.example.reto32.repository.CRUDRepository;

import com.example.reto32.entities.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationCRUDRepository extends CrudRepository<Reservation, Integer> {
}
