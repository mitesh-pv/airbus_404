package com.airbus.flightreservations.FlightReservations.model;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
public class Airport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long airport_id;

    @NotNull
    private String name;

    @NotNull
    private String location;



}
