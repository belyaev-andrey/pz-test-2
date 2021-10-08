package com.example.puzzlerstest2.repositories;

import com.example.puzzlerstest2.entities.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface OwnerRepository extends JpaRepository<Owner, Long> {

    Set<Owner> findOwnersByPhoneNumber(String number);

}