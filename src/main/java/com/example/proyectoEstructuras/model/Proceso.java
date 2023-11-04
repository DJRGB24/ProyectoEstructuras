package com.example.proyectoEstructuras.model;

import java.util.List;

public class Proceso {
    private int id;
    private String nombre;
    private List<Actividad> listaActividades;

    public Proceso(int id, String nombre, List<Actividad> listaActividades) {
        this.id = id;
        this.nombre = nombre;
        this.listaActividades = listaActividades;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Actividad> getListaActividades() {
        return listaActividades;
    }

    public void setListaActividades(List<Actividad> listaActividades) {
        this.listaActividades = listaActividades;
    }
}
