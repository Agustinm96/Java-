package app;

import java.util.Iterator;
import java.util.LinkedList;

public class ListaPremium implements I_Reproduccion{
    private String nombre;
    LinkedList<Cancion>miLista;

    public ListaPremium(String n){
        nombre = n;
        miLista = new LinkedList<Cancion>();
    }

    @Override
    public String reproducir() {
        verMiLista();

        return "\n Si encontro la cancion que desea reproducir, introduzca su nombre a continuacion: ";
    }



    public String reproducirAuxiliar (String n){
        int flag=0, rta=0;
        Iterator <Cancion> iterator = miLista.iterator();
        while(iterator.hasNext() && flag == 0)
        {
            if (iterator.next().getNombre().equalsIgnoreCase(n)){
                flag++;
                rta = iterator.next().getId();
            }
        }
        return "\n Reproduciendo: " +miLista.get(rta-2).getNombre();
    }



    @Override
    public void añadirCancion(Cancion e) {
        miLista.addLast(e);
    }


    @Override
    public String eliminarCancion(String n) {

        Cancion aux = new Cancion();
        int flag=0, rta =0;
        Iterator <Cancion> iterator = miLista.iterator();

        while(iterator.hasNext() && flag == 0)
        {
            if (iterator.next().getNombre().equalsIgnoreCase(n)){
                flag++;
                aux = iterator.next(); //devuelve la siguiente a la que coinciden
                rta = miLista.indexOf(aux); //obtengo el incide de aux
                miLista.remove(rta-1); //le resto 1 para que sea la cancion cuyo nombre coincide con 'n'
            }
        }

        if(flag==0)
            return "\n Cancion no esta en su playlist";
        else
              return "\n Cancion eliminada.";

    }

    @Override
    public void verMiLista() {
        Iterator <Cancion> iterator = miLista.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next().toString());
        }
    }

    public int cantElementosLista ()
    {
        return miLista.size();
    }
}
