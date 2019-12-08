package com.airbus.flightreservations.FlightReservations.model;

import com.sun.istack.NotNull;
import org.hibernate.annotations.GeneratorType;
import org.springframework.cglib.core.GeneratorStrategy;

import javax.persistence.*;

@Entity
@Table
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private String password;

    @NotNull
    private String mail;
}
