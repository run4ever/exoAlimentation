package org.example.exoalimentation.domain.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Groupe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String nomGroupe;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNomgroupe() {
        return nomGroupe;
    }

    public void setNomgroupe(String nomGroupe) {
        this.nomGroupe = nomGroupe;
    }
}
