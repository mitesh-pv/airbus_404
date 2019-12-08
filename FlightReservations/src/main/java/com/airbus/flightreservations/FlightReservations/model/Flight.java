package com.airbus.flightreservations.FlightReservations.model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

@Entity
@Table
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long flight_id;

    @NotNull
    private String name;

    @NotNull
    private String source;

    @NotNull
    private String destination;

    @NotNull
    private Date date;

    @NotNull
    private Time source_time;

    @NotNull
    private Time destination_time;

    @NotNull
    private Long travel_time;

    @NotNull
    private Long price;

}
