package com.SemTaskWZRZNC.project.carswebapp.domain.repository;

import com.SemTaskWZRZNC.project.carswebapp.domain.entity.EntityUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IUserRepository extends JpaRepository<EntityUser, Long> {
    Optional<EntityUser> findByEmail(String userEmail);
}
