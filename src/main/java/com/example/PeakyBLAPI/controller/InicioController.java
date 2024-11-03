package com.example.PeakyBLAPI.controller;
import com.example.PeakyBLAPI.model.Serie;
import com.example.PeakyBLAPI.services.SerieService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InicioController {

    private final SerieService serieService;

    public InicioController(SerieService serieService) {
        this.serieService = serieService;
    }
    @GetMapping("/")
    public String index(Model model) {
        // Obtener la serie principal
        Serie serie = serieService.getMainSerie();

        // Calcular el promedio de calificación
        double promedioCalificacion = serie.getTemporadas().stream()
                .flatMap(t -> t.getEpisodios().stream())
                .mapToDouble(e -> e.getCalificacion())
                .average()
                .orElse(0.0);

        // Obtener el episodio mejor calificado
        String mejorCapitulo = serie.getTemporadas().stream()
                .flatMap(t -> t.getEpisodios().stream())
                .max((e1, e2) -> Double.compare(e1.getCalificacion(), e2.getCalificacion()))
                .map(e -> e.getNombre())
                .orElse("No hay episodios");

        // Agregar atributos al modelo para que estén disponibles en el HTML
        model.addAttribute("serie", serie);
        model.addAttribute("promedioCalificacion", promedioCalificacion);
        model.addAttribute("mejorCapitulo", mejorCapitulo);

        // Retornar la plantilla `index.html`
        return "index";
    }
}
