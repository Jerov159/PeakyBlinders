package com.example.PeakyBLAPI.controller;

import com.example.PeakyBLAPI.model.Serie;
import com.example.PeakyBLAPI.services.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/series")
public class SerieController {

    private final SerieService serieService;

    @Autowired
    public SerieController(SerieService serieService) {
        this.serieService = serieService;
    }

    @GetMapping
    public String getSerieInfo(Model model) {
        Serie serie = serieService.getSerieInfo(); // Asegúrate de que este método existe en tu servicio
        model.addAttribute("serie", serie);
        return "serie";
    }
}

