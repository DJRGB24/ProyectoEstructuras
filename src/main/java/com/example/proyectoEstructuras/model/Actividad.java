package com.example.proyectoEstructuras.model;

import java.util.List;

public class Actividad {

    private int id;
    private String nombre;
    private String descripcion;
    private boolean obligatorio;
    private List<Tarea> listaTareas;

    public Actividad(int id, String nombre, String descripcion, boolean obligatorio, List<Tarea> listaTareas) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.obligatorio = obligatorio;
        this.listaTareas = listaTareas;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isObligatorio() {
        return obligatorio;
    }

    public void setObligatorio(boolean obligatorio) {
        this.obligatorio = obligatorio;
    }

    public List<Tarea> getListaTareas() {
        return listaTareas;
    }

    public void setListaTareas(List<Tarea> listaTareas) {
        this.listaTareas = listaTareas;
    }
    //+ Precedencia(Actividad): Actividad
//+ Siguiente(Actividad): Actividad

}
