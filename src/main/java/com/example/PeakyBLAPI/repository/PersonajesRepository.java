package com.example.PeakyBLAPI.repository;

import com.example.PeakyBLAPI.model.Personajes;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonajesRepository extends JpaRepository<Personajes, Long> {
    List<Personajes> findByTemporadasSerieId(Long serieId);
}
