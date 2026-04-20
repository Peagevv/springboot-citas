package com.pwcitas.springbootcitas.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.pwcitas.springbootcitas.model.Cita;

@Service
public class CitaService {

    private final List<Cita> citas = new ArrayList<>();
    private Long contador = 1L;

    public List<Cita> obtenerCitas() {
        return citas;
    }

    public Cita guardarCita(Cita cita) {
        cita.setId(contador++);
        citas.add(cita);
        return cita;
    }
}