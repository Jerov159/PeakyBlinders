package com.example.PeakyBLAPI.services;

import com.example.PeakyBLAPI.model.Episodio;
import com.example.PeakyBLAPI.repository.EpisodioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EpisodioService {

    private final EpisodioRepository episodioRepository;

    @Autowired
    public EpisodioService(EpisodioRepository episodioRepository) {
        this.episodioRepository = episodioRepository;
    }

    // Obtener todos los episodios
    public List<Episodio> getAllEpisodios() {
        return episodioRepository.findAll();
    }

    // Guardar un episodio
    public Episodio saveEpisodio(Episodio episodio) {
        return episodioRepository.save(episodio);
    }

    // Obtener un episodio por su ID
    public Episodio getEpisodio(Long id) {
        Optional<Episodio> episodio = episodioRepository.findById(id);
        return episodio.orElse(null); // Devuelve null si el episodio no existe
    }

    // Eliminar un episodio por su ID
    public void deleteEpisodio(Long id) {
        episodioRepository.deleteById(id);
    }
}


