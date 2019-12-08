package com.airbus.flightreservations.FlightReservations.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class BookingCompositeKey implements Serializable {

    private Long user;
    private Long flight;
}
