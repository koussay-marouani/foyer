package com.example.foyer.services;


import com.example.foyer.entities.Reservation;
import com.example.foyer.repositories.ReservationRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ReservationService implements IReservationService {

@Autowired
ReservationRepository reservationRepository;
    @Override
    public Reservation addReservation(Reservation reservation) {
        return (reservationRepository.save(reservation));
    }

    @Override
    public List<Reservation> getAllReservations() {
        return List.of();
    }

    @Override
    public Reservation getReservationById(long idReservation) {
        return null;
    }

    @Override
    public void deleteReservation(long idReservation) {

    }

    @Override
    public Reservation updateReservation(Reservation reservation) {
        return null;
    }
}
