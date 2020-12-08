package com.SemTaskWZRZNC.project.carswebapp.service;

import com.SemTaskWZRZNC.project.carswebapp.domain.CarBrand;
import com.SemTaskWZRZNC.project.carswebapp.domain.entity.BasicCar;
import com.SemTaskWZRZNC.project.carswebapp.domain.entity.EntityUser;
import com.SemTaskWZRZNC.project.carswebapp.domain.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestDateFactory implements CommandLineRunner {

    @Autowired
    private IBasicCarDAO carDAO;

    @Autowired
    private IUserRepository userDao;

    private void addCar(){
        carDAO.SaveBasicCar(createCar());
    }

    private void addUser(){
        userDao.save(createUser());
    }

    private BasicCar createCar() {
        return BasicCar.builder()
                //.brand(CarBrand.FORD)
                .brand("Audi")
                .type("A8")
                .design("Kombi")
                .build();
    }

    private EntityUser createUser() {
        return EntityUser.builder()
                .email("user@user.com")
                .password("test123")
                .role("USER")
                .build();
    }


    @Override
    public void run(String... args) {
        addUser();
        addCar();
    }
}
