package com.SemTaskWZRZNC.project.carswebapp.service;

import com.SemTaskWZRZNC.project.carswebapp.domain.entity.BasicCar;
import com.SemTaskWZRZNC.project.carswebapp.domain.entity.EntityUser;
import com.SemTaskWZRZNC.project.carswebapp.domain.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestDataFactory implements CommandLineRunner {

    @Autowired
    private IBasicCarDAO carDAO;

    @Autowired
    private IUserRepository userDao;

    private void addCar(String brand, String type, String design){
        carDAO.SaveBasicCar(createCar(brand, type, design));
    }

    private void addUser(){
        userDao.save(createUser());
    }

    private BasicCar createCar(String brand, String type, String design) {
        return BasicCar.builder()
                //.brand(CarBrand.FORD)
                .brand(brand)
                .type(type)
                .design(design)
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
        for (int i=0; i<8;i++){
            addCar("Audi","A"+(i+1), "Sport");
        }
    }
}
