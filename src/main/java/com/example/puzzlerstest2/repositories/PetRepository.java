package com.example.puzzlerstest2.repositories;

import com.example.puzzlerstest2.entities.Pet;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.NamedEntityGraph;
import java.util.List;

public interface PetRepository extends JpaRepository<Pet, Long> {

    @Override
    @EntityGraph(value = "pet-with-owner")
    List<Pet> findAll();

}