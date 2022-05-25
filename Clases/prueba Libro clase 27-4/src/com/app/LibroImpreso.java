package com.app;

public class LibroImpreso extends Libro {
    private float precio;

    public LibroImpreso(String nombreP, int cantPaginasP, float precioP) {
       super(nombreP, cantPaginasP);
        precio = precioP;
    }

    public float getPrecio() {
        return precio;
    }

    @Override
    public int difusion() {
        return 0;
    }

    @Override
    public void escribirDescripcion() {
        System.out.println("\n Nombre: " + getNombre() + "\n Cantidad de paginas: " + getCantPaginas() + "\n Precio:" + getPrecio());

    }

}