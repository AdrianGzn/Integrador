package com.adr.proyectointegrador.models;

import java.time.LocalDate;

public class Solicitud extends Incidencia{

    public Solicitud(int id, int mactricula, String tipo, String descripcion, String color, LocalDate fecha, String aula, boolean status) {
        super(id, mactricula, tipo, descripcion, color, fecha, aula, status);
    }
}
