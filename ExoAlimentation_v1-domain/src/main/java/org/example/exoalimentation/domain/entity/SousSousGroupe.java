package org.example.exoalimentation.domain.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SousSousGroupe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String nomSousSousGroupe;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNomSousSousGroupe() {
        return nomSousSousGroupe;
    }

    public void setNomSousSousGroupe(String nomSousSousGroupe) {
        this.nomSousSousGroupe = nomSousSousGroupe;
    }
}