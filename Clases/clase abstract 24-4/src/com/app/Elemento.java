package com.app;

public abstract class Elemento {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String comentario()
    {
        return "muy bueno";
    }

    public boolean loTengo ()
    {
        return true;
    }
}
