package com.airbus.flightreservations.FlightReservations.controller;

import com.airbus.flightreservations.FlightReservations.model.Flight;
import com.airbus.flightreservations.FlightReservations.model.FlightDetails;
import com.airbus.flightreservations.FlightReservations.repository.AirportRepository;
import com.airbus.flightreservations.FlightReservations.repository.FlightRepository;
import com.airbus.flightreservations.FlightReservations.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class ShowFlightDetails {

    @Autowired
    public AirportRepository airportRepository;

    @Autowired
    public FlightRepository flightRepository;

    @Autowired
    public FlightService flightService;

    @GetMapping("/showAirport")
    public List<String> showAirport(){
        return airportRepository.findAllAirportNames();
    }

    @GetMapping("/showFlightDetails")
    public List<FlightDetails> showFlightDetails(@RequestParam String source, @RequestParam String destination, @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime date){
        return flightService.getFlightDetails(source, destination, date);
    }


}
