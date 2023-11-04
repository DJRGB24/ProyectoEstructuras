package com.example.proyectoEstructuras.model;

public class Tarea {

    private int id;
    private String descripcion;
    private boolean obligatorio;
    private int duracion;

    public Tarea(int id, String descripcion, boolean obligatorio, int duracion) {
        this.id = id;
        this.descripcion = descripcion;
        this.obligatorio = obligatorio;
        this.duracion = duracion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    //    Clase: Tarea
//- ID: int
//- Descripción: string
//- Obligatorio: bool
//- Duración: int
}
