package org.example.exoalimentation.domain.entity;

import javax.persistence.*;

@Entity
public class Aliment {

    @Id
    private Integer Id;

    private String nomAliment;

    @ManyToOne(cascade=CascadeType.ALL)
    private Groupe groupe;

    @ManyToOne(cascade=CascadeType.ALL)
    private SousGroupe sousgroupe;

    @ManyToOne(cascade=CascadeType.ALL)
    private SousSousGroupe soussousgroupe;

    @OneToOne(cascade=CascadeType.ALL)
    private Composition composition;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getNomAliment() {
        return nomAliment;
    }

    public void setNomAliment(String nomAliment) {
        this.nomAliment = nomAliment;
    }

    public Groupe getGroupe() {
        return groupe;
    }

    public void setGroupe(Groupe groupe) {
        this.groupe = groupe;
    }

    public SousGroupe getSousgroupe() {
        return sousgroupe;
    }

    public void setSousgroupe(SousGroupe sousgroupe) {
        this.sousgroupe = sousgroupe;
    }

    public SousSousGroupe getSoussousgroupe() {
        return soussousgroupe;
    }

    public void setSoussousgroupe(SousSousGroupe soussousgroupe) {
        this.soussousgroupe = soussousgroupe;
    }

    public Composition getComposition() {
        return composition;
    }

    public void setComposition(Composition composition) {
        this.composition = composition;
    }


}
