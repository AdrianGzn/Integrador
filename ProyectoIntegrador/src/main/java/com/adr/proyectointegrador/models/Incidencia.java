package com.adr.proyectointegrador.models;

import java.time.LocalDate;

public class Incidencia {
    private int id;
    private int mactricula;
    private String tipo;
    private String descripcion;
    private String color;
    private LocalDate fecha;
    private String aula;
    private boolean status;

    public Incidencia(int id, int mactricula, String tipo, String descripcion, String color, LocalDate fecha, String aula, boolean status) {
        this.id = id;
        this.mactricula = mactricula;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.color = color;
        this.fecha = fecha;
        this.aula = aula;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMactricula() {
        return mactricula;
    }

    public void setMactricula(int mactricula) {
        this.mactricula = mactricula;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
