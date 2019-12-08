package com.airbus.flightreservations.FlightReservations.model;


import javax.persistence.*;

@Entity
@Table
@IdClass(FlightAirportMappingCompositeKey.class)
public class FlightAirportMapping {

    @Id
    @ManyToOne
    private Airport airport;

    @Id
    @ManyToOne
    private Flight flight;
}
