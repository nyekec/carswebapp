package com.SemTaskWZRZNC.project.carswebapp.domain.repository;

import com.SemTaskWZRZNC.project.carswebapp.domain.entity.BasicCar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBasicCarRepository extends JpaRepository<BasicCar, Long> {
}
