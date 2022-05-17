package app;

import java.util.Stack;

public class ListaBasica implements I_Reproduccion{
    Stack<Cancion> miLista;

    public ListaBasica (){
        miLista = new Stack<Cancion>();
    }

    public int getCantidadElStack ()
    {
        return miLista.size();
    }

    public boolean tieneElOno ()
    {
        return miLista.empty(); //si tiene elementos debe devolver Falso
    }

    @Override
    public String reproducir() {
         Cancion aux = miLista.peek();
         Stack<Cancion>listaAux = new Stack<Cancion>(); //Stack auxiliar

         while(!miLista.empty()) { //extraigo elementos de pila 1, los paso a pila 2.
             listaAux.add(miLista.pop());
         }

         miLista.add(aux); //agrego cancion que retorna al princio//final de la pila original.

        while(!listaAux.empty()) { //extraigo elementos de pila 2, los paso a pila 1.
            miLista.add(listaAux.pop());
        }
        listaAux.clear(); //borro x si las dudas elementos de pila

        return aux.toString();
    }

    public boolean existeOno (Cancion aux) {
        return miLista.contains(aux);
    }

    @Override
    public void añadirCancion(Cancion e) {
        if (existeOno(e))
        {
            System.out.println("\n Cancion ya esta en su playlist");
        }
        else{
            miLista.add(e);
            System.out.println("\n Cancion agregada a su playlist");
        }


    }

    @Override
    public String eliminarCancion(String n) {
        return "\n Para acceder a esta funcionalidad debe adquirir Spotify Premium";
    }

    @Override
    public void verMiLista() {
        for(Object lista : miLista)
        {
            System.out.println(lista.toString());
        }
    }
}
