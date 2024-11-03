package com.example.PeakyBLAPI.repository;

import com.example.PeakyBLAPI.model.Episodio;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface EpisodioRepository extends JpaRepository<Episodio, Long> {
    List<Episodio> findByTemporadaId(Long temporadaId);
}
