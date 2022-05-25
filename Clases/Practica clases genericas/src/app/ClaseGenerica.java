package app;

import java.util.ArrayList;

public class ClaseGenerica <T>{
    private ArrayList<T> lista;

    public ClaseGenerica(){
        lista = new ArrayList<T>();
    }

    public void añadirElemento(T elemento){
        lista.add(elemento);
    }

    public int cantidadElementos(){
        return lista.size();
    }

    public void eliminarElemento(T elemento){
        if(lista.contains(elemento)){
            lista.remove(elemento);
        }
    }

    public void mostrarLista(){
        int i=0;
        while(i<lista.size()){
            lista.get(i);
            i++;
        }
    }
}
