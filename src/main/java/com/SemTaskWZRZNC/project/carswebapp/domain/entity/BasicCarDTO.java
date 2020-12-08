package com.SemTaskWZRZNC.project.carswebapp.domain.entity;

import lombok.*;

import javax.persistence.*;

@Value
@Builder
@AllArgsConstructor
public class BasicCarDTO {

    Long id;
    //@Enumerated(EnumType.STRING)
    //private CarBrand brand;
    String brand;
    String type;
    String design;
    String year;
    String color;
    int cubicCapacity;
    String fuelType;
    String transmission;



    //@OneToOne(cascade = CascadeType.ALL)
    //private FullDetails fullDetails;
}
