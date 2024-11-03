package com.example.PeakyBLAPI.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
public class Episodio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private String codigo;

    @Getter
    @Setter
    private String nombre;

    @Getter
    @Setter
    private String descripcion;

    @Getter
    @Setter
    private double calificacion;

    @ElementCollection
    @Getter
    @Setter
    private List<String> fotos; // Lista de URLs o nombres de archivos de imágenes


    @ManyToOne
    @JsonIgnore
    @Getter
    @Setter
    @JoinColumn(name = "temporada_id")
    private Temporada temporada;

    // Getters y setters
}
