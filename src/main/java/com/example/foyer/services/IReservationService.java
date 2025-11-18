package com.example.foyer.services;


import com.example.foyer.entities.Reservation;

import java.util.List;

public interface IReservationService {
    Reservation addReservation(Reservation reservation);
    List<Reservation> getAllReservations();
    Reservation getReservationById(long idReservation);
    void deleteReservation(long idReservation);
    Reservation updateReservation(Reservation reservation);
}
