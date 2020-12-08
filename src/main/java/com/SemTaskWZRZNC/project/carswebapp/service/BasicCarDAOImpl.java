package com.SemTaskWZRZNC.project.carswebapp.service;

import com.SemTaskWZRZNC.project.carswebapp.domain.entity.BasicCar;
import com.SemTaskWZRZNC.project.carswebapp.domain.repository.IBasicCarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasicCarDAOImpl implements IBasicCarDAO {

    @Autowired
    private IBasicCarRepository repository;

    @Override
    public void SaveBasicCar(BasicCar basicCar) {
        repository.save(basicCar);
    }

    @Override
    public List<BasicCar> ShowCars() {
        return repository.findAll();
    }

    @Override
    public BasicCar getDetails(Long id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public void DeleteBasicCar(Long id) {
        repository.deleteById(id);
    }
}
