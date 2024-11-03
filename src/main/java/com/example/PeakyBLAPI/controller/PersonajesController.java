package com.example.PeakyBLAPI.controller;

import com.example.PeakyBLAPI.services.PersonajesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/personajes")
public class PersonajesController {

    private final PersonajesService personajesService;

    @Autowired
    public PersonajesController(PersonajesService personajesService) {
        this.personajesService = personajesService;
    }

    @GetMapping
    public String listarPersonajes(Model model) {
        model.addAttribute("personajes", personajesService.getAllPersonajes());
        return "personajes";
    }
}


