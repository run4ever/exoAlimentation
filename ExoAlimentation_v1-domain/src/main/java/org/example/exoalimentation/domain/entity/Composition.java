package org.example.exoalimentation.domain.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Composition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private Double eau;
    private Double proteine;
    private Double lipide;
    private Double glucide;
    private Double sucre;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Double getEau() {
        return eau;
    }

    public void setEau(Double eau) {
        this.eau = eau;
    }

    public Double getProteine() {
        return proteine;
    }

    public void setProteine(Double proteine) {
        this.proteine = proteine;
    }

    public Double getLipide() {
        return lipide;
    }

    public void setLipide(Double lipide) {
        this.lipide = lipide;
    }

    public Double getGlucide() {
        return glucide;
    }

    public void setGlucide(Double glucide) {
        this.glucide = glucide;
    }

    public Double getSucre() {
        return sucre;
    }

    public void setSucre(Double sucre) {
        this.sucre = sucre;
    }
}
