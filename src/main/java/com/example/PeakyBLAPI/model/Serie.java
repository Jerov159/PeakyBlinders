package com.example.PeakyBLAPI.model;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
public class Serie {

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
        private String creador;

        @Getter
        @Setter
        private String clasificacion;

        @Getter
        @Setter
        private String imagenPoster;

        @Getter
        @Setter
        @OneToMany(mappedBy = "serie", cascade = CascadeType.ALL)
        private List<Temporada> temporadas;

        // Getters y setters
    }

