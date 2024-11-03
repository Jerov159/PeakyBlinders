package com.example.PeakyBLAPI.model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity

public class Temporada {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private int numeroTemporada;

    @Getter
    @Setter
    private int anioEmision;

    @ManyToOne
    @JsonIgnore
    @Getter
    @Setter
    @JoinColumn(name = "serie_id")
    private Serie serie;

    @Getter
    @Setter
    @OneToMany(mappedBy = "temporada", cascade = CascadeType.ALL)
    private List<Episodio> episodios;

    @ManyToMany
    @Getter
    @Setter
    @JoinTable(
            name = "temporada_personaje",
            joinColumns = @JoinColumn(name = "temporada_id"),
            inverseJoinColumns = @JoinColumn(name = "personaje_id")
    )
    private List<Personajes> personajes;

    // Getters y setters
}

