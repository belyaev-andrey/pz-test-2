package com.example.puzzlerstest2.entities;

import javax.persistence.*;

@Table(name = "address")
@Entity
public class Address {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "address_line")
    private String addressLine;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String getAddressLine() {
        return addressLine;
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}