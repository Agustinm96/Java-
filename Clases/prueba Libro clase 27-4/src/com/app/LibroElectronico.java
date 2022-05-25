package com.app;

public class LibroElectronico extends Libro{

    public LibroElectronico (String nombreP, int cantPaginasP)
    {
        super(nombreP,cantPaginasP);
    }

    @Override
    public int difusion() {
        return 0;
    }

    @Override
    public void escribirDescripcion() {
        System.out.println( "\n Nombre: " +getNombre() + "\n Cantidad de paginas: " +getCantPaginas());
    }
}
