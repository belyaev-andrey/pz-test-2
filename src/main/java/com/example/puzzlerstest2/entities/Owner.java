package com.example.puzzlerstest2.entities;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Table(name = "owner")
@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Owner {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "owner", orphanRemoval = true)
    @ToString.Exclude
    private Set<Pet> pets;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Owner owner = (Owner) o;
        return id != null && Objects.equals(id, owner.id);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}