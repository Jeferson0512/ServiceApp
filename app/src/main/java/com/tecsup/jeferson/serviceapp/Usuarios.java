package com.tecsup.jeferson.serviceapp;

/**
 * Created by Alumno on 9/25/2017.
 */

public class Usuarios {

    private String contraseña_uno,contraseña_dos;
    private String usuario_uno,usuario_dos;

    public Usuarios() {
        this.contraseña_uno = contraseña_uno;
        this.contraseña_dos = contraseña_dos;
        this.usuario_uno = usuario_uno;
        this.usuario_dos = usuario_dos;
    }

    public String getContraseña_uno() {
        return contraseña_uno;
    }

    public void setContraseña_uno(String contraseña_uno) {
        this.contraseña_uno = contraseña_uno;
    }

    public String getContraseña_dos() {
        return contraseña_dos;
    }

    public void setContraseña_dos(String contraseña_dos) {
        this.contraseña_dos = contraseña_dos;
    }

    public String getUsuario_uno() {
        return usuario_uno;
    }

    public void setUsuario_uno(String usuario_uno) {
        this.usuario_uno = usuario_uno;
    }

    public String getUsuario_dos() {
        return usuario_dos;
    }

    public void setUsuario_dos(String usuario_dos) {
        this.usuario_dos = usuario_dos;
    }

    @Override
    public String toString() {
        return "Usuarios{" +
                "contraseña_uno='" + contraseña_uno + '\'' +
                ", contraseña_dos='" + contraseña_dos + '\'' +
                ", usuario_uno='" + usuario_uno + '\'' +
                ", usuario_dos='" + usuario_dos + '\'' +
                '}';
    }
}
