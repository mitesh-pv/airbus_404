package com.airbus.flightreservations.FlightReservations.repository;

import com.airbus.flightreservations.FlightReservations.model.FlightAirportMapping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightAirportMappingRepository extends JpaRepository<FlightAirportMapping, Long> {

//    @Query("select new com.airbus.flightreservations.FlightReservations.model.FlightAirportMapping()")
//    private void showFlightDetails(String source, String destination);
}
