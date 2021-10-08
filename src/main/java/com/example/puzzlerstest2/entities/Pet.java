package com.example.puzzlerstest2.entities;

import lombok.*;

import javax.persistence.*;

@Table(name = "pet")
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Pet {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;

    @OneToOne(mappedBy = "pet")
    private Collar collar;

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "name = " + name + ", " +
                "collar = " + collar + ")";
    }
}