package com.pwcitas.springbootcitas.model;

public class Cita {

    private Long id;
    private String nombreCliente;
    private String servicio;
    private String fecha;
    private String hora;

    public Cita() {
    }

    public Cita(Long id, String nombreCliente, String servicio, String fecha, String hora) {
        this.id = id;
        this.nombreCliente = nombreCliente;
        this.servicio = servicio;
        this.fecha = fecha;
        this.hora = hora;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}