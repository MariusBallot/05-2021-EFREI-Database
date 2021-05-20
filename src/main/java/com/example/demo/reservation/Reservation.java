package com.example.demo.reservation;

import javax.persistence.*;

@Entity
@Table
public class Reservation {
    @Id
    @SequenceGenerator(
            name= "reservation_sequence",
            sequenceName = "reservation_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "reservation_sequence"
    )

    private Long id;
    private String mm;

}
