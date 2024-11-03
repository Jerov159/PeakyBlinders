package com.example.PeakyBLAPI.controller;

import com.example.PeakyBLAPI.model.Temporada;
import com.example.PeakyBLAPI.services.TemporadaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/temporadas")
public class TemporadaController {

    private final TemporadaService temporadaService;

    @Autowired
    public TemporadaController(TemporadaService temporadaService) {
        this.temporadaService = temporadaService;
    }

    @GetMapping
    public String listarTemporadas(Model model) {
        List<Temporada> temporadas = temporadaService.getAllTemporadas();
        model.addAttribute("temporadas", temporadas);
        return "temporadas"; // Nombre del archivo HTML que usaremos para mostrar las temporadas
    }
}


