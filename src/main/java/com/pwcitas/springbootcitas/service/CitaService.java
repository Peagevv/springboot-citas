package com.pwcitas.springbootcitas.service;

import com.pwcitas.springbootcitas.model.Cita;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

    public Cita actualizarCita(Long id, Cita citaActualizada) {
        for (Cita cita : citas) {
            if (cita.getId().equals(id)) {
                cita.setNombreCliente(citaActualizada.getNombreCliente());
                cita.setServicio(citaActualizada.getServicio());
                cita.setFecha(citaActualizada.getFecha());
                cita.setHora(citaActualizada.getHora());
                return cita;
            }
        }
        return null;
    }

    public boolean eliminarCita(Long id) {
        return citas.removeIf(cita -> cita.getId().equals(id));
    }
}