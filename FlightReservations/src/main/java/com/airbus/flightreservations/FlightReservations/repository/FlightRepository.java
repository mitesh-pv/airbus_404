package com.airbus.flightreservations.FlightReservations.repository;

import com.airbus.flightreservations.FlightReservations.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.sql.Time;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public interface FlightRepository extends JpaRepository<Flight, Long> {

    @Query("select new com.airbus.flightreservations.FlightReservations.model.Flight(f.flightId, f.name, f.source, f.destination, f.date, f.sourceTime, f.destinationTime, f.travelTime, f.price) from Flight f where f.source=:source and f.destination=:destination and f.date=:date")
    public List<Flight> showFlightDetails(@Param("source") String source,@Param("destination") String destination,@Param("date") LocalDateTime date);

    @Query("select new com.airbus.flightreservations.FlightReservations.model.Flight(f.flightId, f.name, f.source, f.destination, f.date, f.sourceTime, f.destinationTime, f.travelTime, f.price) from Flight f")
    public List<Flight> showAllFlights();

    @Query("select new com.airbus.flightreservations.FlightReservations.model.Flight(f.flightId, f.name, f.source, f.destination, f.date, f.sourceTime, f.destinationTime, f.travelTime, f.price) from Flight f where f.source=:source")
    public List<Flight> showAllFlightsBySource(@Param("source") String source);

}
