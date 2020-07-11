package com.apuntes.modelo.vo;

public class Apunte {

    public int getIdApunte() {
        return idApunte;
    }

    public void setIdApunte(int idApunte) {
        this.idApunte = idApunte;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPk_idUsuario() {
        return pk_idUsuario;
    }

    public void setPk_idUsuario(int pk_idUsuario) {
        this.pk_idUsuario = pk_idUsuario;
    }

    private int idApunte;
    private String titulo;
    private String descripcion;
    private int pk_idUsuario;

}
