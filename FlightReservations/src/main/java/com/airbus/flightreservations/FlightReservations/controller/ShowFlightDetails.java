package com.airbus.flightreservations.FlightReservations.controller;

import com.airbus.flightreservations.FlightReservations.repository.AirportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ShowFlightDetails {

    @Autowired
    public AirportRepository airportRepository;

    @GetMapping("/showSource")
    public List<String> showSource(){
        return airportRepository.findAllAirportNames();
    }

    


}
