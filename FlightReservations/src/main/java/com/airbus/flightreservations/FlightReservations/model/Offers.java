package com.airbus.flightreservations.FlightReservations.model;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
public class Offers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long offer_id;

    @NotNull
    private String description;

    @NotNull
    private Long discount;
}