package com.example.brayanasdrubal.practica6;

public class Lista_Entrada {
    private int idImagen;
    private String nombre,nombrePila,nombrei,cant;

    public Lista_Entrada(int idImagen, String nombre, String nombrePila, String nombrei,String cant) {
        this.idImagen = idImagen;
        this.nombre = nombre;
        this.nombrePila = nombrePila;
        this.nombrei = nombrei;
        this.cant = cant;
    }

    public int getIdImagen() {
        return idImagen;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNombrePila() {
        return nombrePila;
    }

    public String getNombrei() {
        return nombrei;
    }

    public String getCant() {
        return cant;
    }
}

