package com.example.demo.reservation;

import org.springframework.web.bind.annotation.PostMapping;

public class ReservationController {

    @PostMapping
    public void postReservation(Reservation res){
        reservationService.addNewRes(res);
    }
}
