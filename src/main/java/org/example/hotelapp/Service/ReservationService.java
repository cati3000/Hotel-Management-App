package org.example.hotelapp.Service;

import org.example.hotelapp.Model.Reservation;
import org.example.hotelapp.Repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    public Reservation bookRoom(Reservation reservation) {
        reservation.setBookingDate(LocalDateTime.now());
        return reservationRepository.save(reservation);
    }

    public void cancelReservation(Long reservationId) {
        reservationRepository.deleteById(reservationId);
    }
}
