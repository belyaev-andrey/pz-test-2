package com.example.puzzlerstest2.repositories;

import com.example.puzzlerstest2.entities.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetRepository extends JpaRepository<Pet, Long> {
}