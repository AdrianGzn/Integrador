package com.adr.proyectointegrador.models;

public class Usuario {
    private int matricula;
    private String contraseña;
    private String tipo;

    public Usuario(int matricula, String contraseña, String tipo) {
        this.matricula = matricula;
        this.contraseña = contraseña;
        this.tipo = tipo;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
