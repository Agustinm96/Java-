package com.utn.colegio;

public class Alumno {
    private String nombre;
    private Nacionalidad nacionalidad;



    public Alumno(String nombre, Nacionalidad nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public Nacionalidad getNacionalidad() {
        return nacionalidad;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                '}';
    }
}
