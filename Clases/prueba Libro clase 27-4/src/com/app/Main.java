package com.app;

public class Main {

    public static void main(String[] args) {
	 Libro [] w = new Libro[2];
     w[0]= new LibroImpreso("La logica de lo impensable", 144, 67.0f);
     w[1] = new LibroElectronico("Catarsis", 220);



     for(int i=0; i<2; i++)
     {
         w[i].escribirDescripcion();
     }

    }
}
