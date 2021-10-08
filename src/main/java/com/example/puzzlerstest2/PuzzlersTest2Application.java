package com.example.puzzlerstest2;

import com.example.puzzlerstest2.entities.Owner;
import com.example.puzzlerstest2.repositories.OwnerRepository;
import com.example.puzzlerstest2.services.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PuzzlersTest2Application implements CommandLineRunner {

    @Autowired
    private OwnerService ownerService;

    public static void main(String[] args) {
        SpringApplication.run(PuzzlersTest2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner = ownerService.getOwnerOnly(1L);
        System.out.println(owner);
    }
}