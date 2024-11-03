package com.example.PeakyBLAPI.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
public class Personajes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private String nombre;
    @Getter
    @Setter
    private String descripcion;

    @Getter
    @Setter
    private String foto;

    @ManyToMany(mappedBy = "personajes")
    private List<Temporada> temporadas;

    // Getters y setters
}
