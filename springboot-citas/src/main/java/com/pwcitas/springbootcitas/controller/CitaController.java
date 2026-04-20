package com.pwcitas.springbootcitas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pwcitas.springbootcitas.model.Cita;
import com.pwcitas.springbootcitas.service.CitaService;

@RestController
@RequestMapping("/api/citas")
@CrossOrigin(origins = "*")
public class CitaController {

    @Autowired
    private CitaService citaService;

    @GetMapping
    public List<Cita> obtenerCitas() {
        return citaService.obtenerCitas();
    }

    @PostMapping
    public Cita guardarCita(@RequestBody Cita cita) {
        return citaService.guardarCita(cita);
    }
}