package app;

import java.util.ArrayList;

public class ListCancion{
    ArrayList <Cancion> listaCanciones;

    public ListCancion () {
        listaCanciones = new ArrayList<Cancion>();
    }

    public void verLista() {
        for(int i=0; i<listaCanciones.size();i++) {
            System.out.println(listaCanciones.get(i).toString());
        }
    }

}

    /**Buscar y retornar elemento de arrayList**/



