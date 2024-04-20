package com.adr.proyectointegrador.models;

import java.time.LocalDate;

public class Reporte extends Incidencia{

    public Reporte(int id, int mactricula, String tipo, String descripcion, String color, LocalDate fecha, String aula, boolean status) {
        super(id, mactricula, tipo, descripcion, color, fecha, aula, status);
    }
}
