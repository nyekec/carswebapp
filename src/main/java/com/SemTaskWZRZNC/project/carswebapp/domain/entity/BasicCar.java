package com.SemTaskWZRZNC.project.carswebapp.domain.entity;

import com.SemTaskWZRZNC.project.carswebapp.domain.CarBrand;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "basic_car")
public class BasicCar {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "base_car_id")
    private Long id;
    //@Enumerated(EnumType.STRING)
    //private CarBrand brand;
    private String brand;
    private String type;
    private String design;
    private String year;
    private String color;
    private int cubicCapacity;
    private String fuelType;
    private String transmission;



    //@OneToOne(cascade = CascadeType.ALL)
    //private FullDetails fullDetails;
}
