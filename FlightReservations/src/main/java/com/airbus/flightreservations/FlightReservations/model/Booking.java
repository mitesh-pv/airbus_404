package com.airbus.flightreservations.FlightReservations.model;

import javax.persistence.*;

@Entity
@Table
@IdClass(BookingCompositeKey.class)
public class Booking {

    @Id
    @ManyToOne
    private User user;

    @Id
    @ManyToOne
    private Flight flight;
}
