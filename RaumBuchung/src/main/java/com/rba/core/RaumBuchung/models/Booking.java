package com.rba.core.RaumBuchung.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long bookingId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User bookingUser;

    /*
    Many to one here as well
     */
    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room correspondingRoom;

    private BookingType bookingType;
    private LocalTime startTime;
    private LocalTime endTime;

    private BookingType type;
}
