package org.example.h2databasespringboot.repository;


import org.example.h2databasespringboot.model.Dog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DogRepository extends JpaRepository<Dog, Long> {
}

