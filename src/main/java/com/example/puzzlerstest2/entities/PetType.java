package com.example.puzzlerstest2.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PetType {

    @Id
    private Long id;

    private String name;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PetType {" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}