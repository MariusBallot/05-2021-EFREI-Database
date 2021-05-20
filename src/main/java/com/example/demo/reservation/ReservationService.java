package com.example.demo.reservation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {
    private final ReservationService reservationService;

    @Autowired
    public ReservationService(ReservationService reservationService) {
        this.reservationService = reservationService;
    }
}
