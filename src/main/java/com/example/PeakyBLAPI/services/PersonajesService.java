package com.example.PeakyBLAPI.services;

import com.example.PeakyBLAPI.model.Personajes;
import com.example.PeakyBLAPI.repository.PersonajesRepository;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class PersonajesService {
    private final PersonajesRepository personajesRepository;

    public PersonajesService(PersonajesRepository personajesRepository) {
        this.personajesRepository = personajesRepository;
    }

    public List<Personajes> getAllPersonajes() {
        return personajesRepository.findAll();
    }

    public Personajes savePersonaje(Personajes personaje) {
        return personajesRepository.save(personaje);
    }
    public List<Personajes> getPersonajesBySerie(Long serieId) {
        return personajesRepository.findByTemporadasSerieId(serieId);
    }
}
