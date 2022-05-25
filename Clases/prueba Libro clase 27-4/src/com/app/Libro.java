package com.app;

public abstract class Libro {
    private String nombre;
    private int cantPaginas;

    public Libro(String nombreP, int cantPaginasP)
    {
        nombre= nombreP;
        cantPaginas=cantPaginasP;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantPaginas() {
        return cantPaginas;
    }

    public abstract int difusion ();

    public abstract void escribirDescripcion();

}
