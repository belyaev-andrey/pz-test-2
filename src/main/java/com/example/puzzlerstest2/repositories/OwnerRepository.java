package com.example.puzzlerstest2.repositories;

import com.example.puzzlerstest2.entities.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRepository extends JpaRepository<Owner, Long> {
}