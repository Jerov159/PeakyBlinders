package com.example.PeakyBLAPI.repository;

import com.example.PeakyBLAPI.model.Temporada;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TemporadaRepository extends JpaRepository<Temporada, Long> {
    List<Temporada> findBySerieId(Long serieId);
}
