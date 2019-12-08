package com.airbus.flightreservations.FlightReservations.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Time;
import java.time.LocalDateTime;
import java.util.Date;

import static org.hibernate.type.descriptor.java.JdbcDateTypeDescriptor.DATE_FORMAT;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long flightId;

    @NotNull
    private String name;

    @NotNull
    private String source;

    @NotNull
    private String destination;

    @ApiModelProperty(required = true,example = "2016-01-01")
    @JsonFormat(pattern = DATE_FORMAT)
    @NotNull
    private LocalDateTime date;

    @NotNull
    private LocalDateTime sourceTime;

    @NotNull
    private LocalDateTime destinationTime;

    @NotNull
    private LocalDateTime travelTime;

    @NotNull
    private Long price;

}
