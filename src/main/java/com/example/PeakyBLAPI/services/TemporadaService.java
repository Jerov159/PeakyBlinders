package com.example.PeakyBLAPI.services;
import com.example.PeakyBLAPI.model.Temporada;
import com.example.PeakyBLAPI.repository.TemporadaRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TemporadaService {
    private final TemporadaRepository temporadaRepository;

    public TemporadaService(TemporadaRepository temporadaRepository) {
        this.temporadaRepository = temporadaRepository;
    }

    public List<Temporada> getAllTemporadas() {
        return temporadaRepository.findAll();
    }

    public Temporada saveTemporada(Temporada temporada) {
        return temporadaRepository.save(temporada);
    }

    public List<Temporada> getTemporadasBySerie(Long serieId) {
        return temporadaRepository.findBySerieId(serieId);
    }
}
