package com.airbus.flightreservations.FlightReservations.model;


import lombok.Data;

import java.io.Serializable;

@Data
public class FlightAirportMappingCompositeKey  implements Serializable {

    private Long airport;
    private Long flight;
}
