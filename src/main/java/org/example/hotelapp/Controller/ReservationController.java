package org.example.hotelapp.Controller;

import org.example.hotelapp.Model.Reservation;
import org.example.hotelapp.Service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reservations")
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    @PostMapping
    public Reservation bookRoom(@RequestBody Reservation reservation) {
        return reservationService.bookRoom(reservation);
    }

    @DeleteMapping("/{id}")
    public void cancelReservation(@PathVariable Long id) {
        reservationService.cancelReservation(id);
    }
}
