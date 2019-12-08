package com.airbus.flightreservations.FlightReservations.repository;

import com.airbus.flightreservations.FlightReservations.model.Airport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AirportRepository extends JpaRepository<Airport,Long> {

    @Query("Select name from Airport")
    public List<String> findAllAirportNames();
}
