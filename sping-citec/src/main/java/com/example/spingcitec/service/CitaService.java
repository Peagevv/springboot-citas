package com.example.spingcitec.service;

import com.example.spingcitec.model.Cita;
import com.example.spingcitec.repository.ICitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CitaService {

    @Autowired
    private ICitaRepository citaRepository;

    public List<Cita> obtenerCitas() {
        return citaRepository.findAll();
    }

    public Cita guardarCita(Cita cita) {
        return citaRepository.save(cita);
    }

    public Cita actualizarCita(Long id, Cita citaActualizada) {
        Optional<Cita> optional = citaRepository.findById(id);
        if (optional.isEmpty()) return null;

        Cita cita = optional.get();
        cita.setNombreCliente(citaActualizada.getNombreCliente());
        cita.setServicio(citaActualizada.getServicio());
        cita.setFecha(citaActualizada.getFecha());
        cita.setHora(citaActualizada.getHora());

        return citaRepository.save(cita);
    }

    public boolean eliminarCita(Long id) {
        if (!citaRepository.existsById(id)) return false;
        citaRepository.deleteById(id);
        return true;
    }
}