package com.pwcitas.springbootcitas.controller;

import com.pwcitas.springbootcitas.model.Cita;
import com.pwcitas.springbootcitas.service.CitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

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

    @PutMapping("/{id}")
    public Object actualizarCita(@PathVariable Long id, @RequestBody Cita cita) {
        Cita actualizada = citaService.actualizarCita(id, cita);

        if (actualizada == null) {
            return Map.of("mensaje", "Cita no encontrada");
        }

        return actualizada;
    }

    @DeleteMapping("/{id}")
    public Map<String, String> eliminarCita(@PathVariable Long id) {
        boolean eliminada = citaService.eliminarCita(id);

        if (!eliminada) {
            return Map.of("mensaje", "Cita no encontrada");
        }

        return Map.of("mensaje", "Cita eliminada correctamente");
    }
}