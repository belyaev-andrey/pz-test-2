package com.example.puzzlerstest2.services;

import com.example.puzzlerstest2.entities.Owner;
import com.example.puzzlerstest2.repositories.OwnerRepository;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Service
public class OwnerService {

    @Autowired
    private OwnerRepository ownerRepository;

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public Owner getOwnerOnly(Long id) {
        Owner owner = ownerRepository.findById(id).orElseThrow();
        return owner;
    }

}