package com.example.PeakyBLAPI.services;
import com.example.PeakyBLAPI.model.Episodio;
import com.example.PeakyBLAPI.model.Serie;
import com.example.PeakyBLAPI.repository.SerieRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Comparator;

@Service
public class SerieService {

    private final SerieRepository serieRepository;

    public SerieService(SerieRepository serieRepository) {
        this.serieRepository = serieRepository;
    }

    public List<Serie> getAllSeries() {
        return serieRepository.findAll();
    }

    public Serie saveSerie(Serie serie) {
        return serieRepository.save(serie);
    }
    public Serie getMainSerie() {
        Serie serie = serieRepository.findById(1L).orElseThrow(() -> new RuntimeException("Serie no encontrada"));

        // Calcular promedio de calificación
        double promedioCalificacion = serie.getTemporadas().stream()
                .flatMap(t -> t.getEpisodios().stream())
                .mapToDouble(Episodio::getCalificacion)
                .average()
                .orElse(0.0);

        // Encontrar el capítulo mejor calificado
        Episodio mejorCapitulo = serie.getTemporadas().stream()
                .flatMap(t -> t.getEpisodios().stream())
                .max(Comparator.comparingDouble(Episodio::getCalificacion))
                .orElse(null);

        // Agrega estos datos a la serie (si es necesario) o retorna junto con la serie
        // Por ejemplo, podrías crear un objeto de respuesta personalizado si quieres incluir estos detalles

        return serie;  // Devolver la serie con toda la información relevante
    }
    public Serie getSerieInfo() {
        return serieRepository.findById(1L).orElse(null); // Asegúrate de que esto coincida con tu estructura de datos
    }
}
