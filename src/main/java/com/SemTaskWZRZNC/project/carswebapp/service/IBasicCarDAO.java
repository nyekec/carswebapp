package com.SemTaskWZRZNC.project.carswebapp.service;

import com.SemTaskWZRZNC.project.carswebapp.domain.entity.BasicCar;
import com.SemTaskWZRZNC.project.carswebapp.domain.entity.BasicCarDTO;

import java.util.List;

public interface IBasicCarDAO {

    void SaveBasicCar(BasicCar basicCar);
    List<BasicCar> ShowCars();
    BasicCar getDetails(Long id);
    void DeleteBasicCar(Long id);
    //FullDetails getFullDetails(Long id);
}
