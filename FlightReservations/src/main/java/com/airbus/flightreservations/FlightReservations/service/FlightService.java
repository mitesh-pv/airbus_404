package com.airbus.flightreservations.FlightReservations.service;

import com.airbus.flightreservations.FlightReservations.model.Flight;
import com.airbus.flightreservations.FlightReservations.model.FlightDetails;
import com.airbus.flightreservations.FlightReservations.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class FlightService {

    @Autowired
    public FlightRepository flightRepository;

    public List<FlightDetails> getFlightDetails(String source, String destination, LocalDateTime date){
        List<Flight> flights = flightRepository.showAllFlights();
        List<Flight> reqFlights = flightRepository.showFlightDetails(source, destination, date);
        List<FlightDetails> flightDetailsList = new ArrayList<>();
        FlightDetails flightDetails = new FlightDetails();
        for(Flight f: reqFlights ){
            flightDetails.setFlight(f);
            flightDetailsList.add(flightDetails);
        }

        String dest;
        List<Flight> flights2 = flightRepository.showAllFlightsBySource(source);
        //System.out.println("LIST 1: "+flights2);
        for(Flight flight: flights2){
                dest=flight.getDestination();
                List<Flight>flights1 = flightRepository.showAllFlightsBySource(dest);
                //System.out.println("LIST 2: "+flights1);

            for(Flight f: flights1){
                    if(f.getDestination().equals(destination)){

                        Flight flightTemp = new Flight();
                        flightTemp.setSource(source);
                        flightTemp.setDestination(destination);
                        flightTemp.setDate(f.getDate());
                        flightTemp.setDestinationTime(f.getDestinationTime());
                        flightTemp.setSourceTime(flight.getSourceTime());
                        flightTemp.setTravelTime(flight.getTravelTime());


                        FlightDetails flightDetails1 = new FlightDetails();
                        flightDetails1.setFlight(flightTemp);
                        flightDetails1.setConnected(f.getSource());
                        flightDetailsList.add(flightDetails1);
                    }
                }
        }

        return flightDetailsList;


    }
}
