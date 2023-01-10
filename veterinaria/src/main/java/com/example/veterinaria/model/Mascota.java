package com.example.veterinaria.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Mascota {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    
    private String nombre;
    private String especie;
    private String raza;
    private String color;
    
    @OneToOne
    @JoinColumn(name="id_duenio", referencedColumnName="id")
    private Dueño unDuenio; 

    public Mascota() {
    }

    public Mascota(Long id, String nombre, String especie, String raza, String color, Dueño unDuenio) {
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.color = color;
        this.unDuenio = unDuenio;
    }

    
    
    
    
}
