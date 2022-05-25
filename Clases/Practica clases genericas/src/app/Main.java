package app;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ClaseGenerica lista = new ClaseGenerica<Persona>();

        Persona p1 = new Persona("Agustin", 25);
        Persona p2 = new Persona("Gisel", 29);
        Persona p3 = new Persona("Liam", 4);

        lista.añadirElemento(p1);
        lista.añadirElemento(p2);
        lista.añadirElemento(p3);

        lista.mostrarLista();

        for(int i=0; i<lista.cantidadElementos(); i++){
            System.out.println(lista.);
        }
    }
}
