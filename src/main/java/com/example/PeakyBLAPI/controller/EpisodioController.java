package com.example.PeakyBLAPI.controller;

import com.example.PeakyBLAPI.model.Episodio;
import com.example.PeakyBLAPI.services.EpisodioService;
import com.example.PeakyBLAPI.services.TemporadaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/episodios")
public class EpisodioController {

    private final EpisodioService episodioService;
    private final TemporadaService temporadaService;

    @Autowired
    public EpisodioController(EpisodioService episodioService, TemporadaService temporadaService) {
        this.episodioService = episodioService;
        this.temporadaService = temporadaService;
    }

    // Mostrar formulario para agregar episodio
    @GetMapping("/agregar")
    public String mostrarFormularioAgregarEpisodio(Model model) {
        model.addAttribute("episodio", new Episodio());
        model.addAttribute("temporadas", temporadaService.getAllTemporadas());  // Lista de temporadas
        return "agregar_capitulo";
    }

    // Guardar el episodio nuevo
    @PostMapping("/agregar")
    public String agregarEpisodio(Episodio episodio) {
        episodioService.saveEpisodio(episodio);
        return "redirect:/episodios";  // Redirige a la lista de episodios después de guardar
    }
}


