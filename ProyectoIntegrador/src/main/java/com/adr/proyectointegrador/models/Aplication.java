package com.adr.proyectointegrador.models;

import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Aplication implements Initializable {
    private ArrayList<Reporte> reportes = new ArrayList<Reporte>();
    private ArrayList<Solicitud> incidencias = new ArrayList<Solicitud>();
    private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
    private int usuarioActual;
    private String tipoUsuarioActual;
    private int idReportes;
    private int idIncidencias;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Usuario admin = new Usuario(233300, "1234", "admin");
        Usuario alumno1 = new Usuario(233301, "1234", "alumno");
        Usuario alumno2 = new Usuario(23302, "1234", "alumno");

        usuarios.add(admin);
        usuarios.add(alumno1);
        usuarios.add(alumno2);

        idReportes = 100;
        idIncidencias = 100;
    }

    public String tipo() {
        return tipoUsuarioActual;
    }

    public void setTipoUsuarioActual(String tipoUsuarioActual) {
        this.tipoUsuarioActual = tipoUsuarioActual;
    }

    public void setUsuarioActual(int usuarioActual) {
        this.usuarioActual = usuarioActual;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }
}
