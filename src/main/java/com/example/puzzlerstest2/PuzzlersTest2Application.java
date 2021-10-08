package com.example.puzzlerstest2;

import com.example.puzzlerstest2.repositories.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PuzzlersTest2Application implements CommandLineRunner {

    @Autowired
    private OwnerRepository ownerRepository;

    public static void main(String[] args) {
        SpringApplication.run(PuzzlersTest2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        ownerRepository.findAll().forEach(System.out::println);
    }
}