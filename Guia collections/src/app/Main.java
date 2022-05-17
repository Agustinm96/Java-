package app;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner teclado;

    public static void main(String[] args) {
        teclado = new Scanner(System.in);

        /**-------------------------------------CANCIONES---------------------------------------**/

        Cancion c1 = new Cancion(1,"Duki","A punta de espada", "3,20", "TRAP", "Desde el fondo del mar", "Ysy A");
        Cancion c2 = new Cancion(2,"Paulo Londra","Chance", "2,50", "POP", "Leones con Flow", null);
        Cancion c3 = new Cancion(3,"CRO","Tranquila", "3,45", "TRAP", "Los del espacio", "Maria Becerra");
        Cancion c4 = new Cancion(4,"Michael", "Jordan", "2,37", "REGUEATON", "23", null);
        Cancion c5 = new Cancion(5,"Oasis","Wonderwall", "3,20", "POP", "Oasis", null);
        Cancion c6 = new Cancion( 6,"Robbie Williams","Rock & roll", "3,20", "ROCK", "Will", null);

        /**-----------------------------AGREGA CANCIONES A ARRAYLIST----------------------------**/

        ListCancion l1 = new ListCancion();
        l1.listaCanciones.add(c1);
        l1.listaCanciones.add(c2);
        l1.listaCanciones.add(c3);
        l1.listaCanciones.add(c4);
        l1.listaCanciones.add(c5);
        l1.listaCanciones.add(c6);

        /*for(Cancion listCan : l1.listaCanciones)
        {
            System.out.println(listCan.toString());
        }*/



        /**-----------------------------AGREGA CANCIONES A STACK----------------------------**/

        ListaBasica lB = new ListaBasica();
        lB.añadirCancion(c1);
        lB.añadirCancion(c2);
        lB.añadirCancion(c3);
        lB.añadirCancion(c4);
        lB.añadirCancion(c5);

        /*System.out.println("\n -------------------------- STACK ------------------------\n");

        lB.verMiLista();//probando
        System.out.println(lB.eliminarCancion("Duketo"));
        int rta = lB.getCantidadElStack();
        System.out.println("\n Cantidad de canciones en la lista: " +rta);
        System.out.println(lB.tieneElOno());
        System.out.println("\n Reproduciendo: " +lB.reproducir());*/

        /**-----------------------------AGREGA CANCIONES A LINKEDLIST----------------------------**/

        ListaPremium lP = new ListaPremium("My list");
        lP.añadirCancion(c1);
        lP.añadirCancion(c2);
        lP.añadirCancion(c3);
        lP.añadirCancion(c4);
        lP.añadirCancion(c5);

      /*  System.out.println("\n -------------------------- LINKED LIST------------------------\n");

        lP.verMiLista();
        int rta2 = lP.cantElementosLista();
        System.out.println("\n Cantidad de elementos: " +rta2);
        System.out.println(lP.reproducirAuxiliar("Chance"));
        System.out.println(lP.eliminarCancion("Duketo"));
        lP.verMiLista();*/

        int opcion, opcionF, opcionAgregarCancion, rtaCanBas, opcionP;
        String noSirve = null;

        do{
            System.out.println("\n\nBIENVENIDO A SPOTIFY!!\n");
            System.out.println("\n SELECCIONE UNA OPCION POR FAVOR.");
            System.out.println("\n Opcion 1. Menu Usuarios Free");
            System.out.println("\n Opcion 2. Menu Usuarios Premium");
            System.out.println("\n Opcion 3. Salir");
            System.out.println("\n OPCION ELEGIDA: ");

            teclado = new Scanner(System.in);
            //teclado.nextLine(); //fflush
            opcion = teclado.nextInt();

            switch (opcion)
            {
                case 1:
                    do{
                        //Menu usuario Free
                        System.out.println("\n Bienvenido a Spotify Free");
                        System.out.println("\n Opcion 1: Ver lista de canciones disponibles");
                        System.out.println("\n Opcion 2: Agregar cancion a mi lista");
                        System.out.println("\n Opcion 3: Eliminar cancion de mi lista");
                        System.out.println("\n Opcion 4: Ver cantidad de canciones en mi lista");
                        System.out.println("\n Opcion 5: Reproducir cancion");
                        System.out.println("\n Opcion 6: Volver a menu principal");
                        System.out.println("\n Seleccione una opcion: ");

                        teclado = new Scanner(System.in);
                        //teclado.nextLine();
                        opcionF = teclado.nextInt();

                        switch (opcionF){
                            case 1:
                                lB.verMiLista();
                                System.out.println("\n Presione cualquier tecla numerica para continuar...");
                                teclado.nextInt();
                                break;
                            case 2:
                                l1.verLista();
                                System.out.println("Ingrese numero de cancion que desea agregar (estan listadas en orden)): ");
                                teclado = new Scanner(System.in);
                                opcionAgregarCancion = teclado.nextInt();
                                Cancion aux = l1.listaCanciones.get(opcionAgregarCancion-1);
                                lB.añadirCancion(aux);
                                System.out.println("\n Presione cualquier tecla numerica para continuar...");
                                teclado.nextInt();
                                break;
                            case 3:
                                System.out.println(lB.eliminarCancion(noSirve));
                                System.out.println("\n Presione cualquier tecla numerica para continuar...");
                                teclado.nextInt();
                                break;
                            case 4:
                                rtaCanBas = lB.getCantidadElStack();
                                System.out.println("\n Cantidad de canciones: " +rtaCanBas);
                                System.out.println("\n Presione cualquier tecla numerica para continuar...");
                                teclado.nextInt();
                                break;
                            case 5:
                                System.out.println("\n Reproduciendo: " +lB.reproducir());
                                System.out.println("\n Presione 'p' para volver al menu principal...");
                                teclado.nextLine();
                                teclado.nextLine();
                                break;

                            case 6:
                                break;
                        }
                    }while (opcionF != 6);

                    break;
                case 2:
                    do {
                        System.out.println("\n Bienvenido a Spotify Premium");
                        System.out.println("\n Opcion 1: Ver lista de canciones disponibles");
                        System.out.println("\n Opcion 2: Agregar cancion a mi lista");
                        System.out.println("\n Opcion 3: Eliminar cancion de mi lista");
                        System.out.println("\n Opcion 4: Ver cantidad de canciones en mi lista");
                        System.out.println("\n Opcion 5: Volver a menu principal");
                        System.out.println("\n Seleccione una opcion: ");

                        teclado = new Scanner(System.in);
                        opcionP = teclado.nextInt();

                        switch (opcionP){
                            case 1:
                                l1.verLista();
                                System.out.println("\n Presione cualquier tecla numerica para continuar...");
                                teclado.nextInt();
                                break;
                            case 2:
                                l1.verLista();
                                System.out.println("Ingrese numero de cancion que desea agregar (estan listadas en orden)): ");
                                teclado = new Scanner(System.in);
                                opcionAgregarCancion = teclado.nextInt();
                                Cancion aux = l1.listaCanciones.get(opcionAgregarCancion);
                                lP.añadirCancion(aux);
                                System.out.println("\n Presione cualquier tecla numerica para continuar...");
                                teclado.nextInt();
                                break;
                            case 3:
                                System.out.println("Ingrese nombre de la cancion a eliminar: ");
                                teclado = new Scanner(System.in);
                                noSirve = teclado.nextLine();
                                System.out.println(lP.eliminarCancion(noSirve));
                                System.out.println("\n Presione cualquier tecla numerica para continuar...");
                                teclado.nextInt();
                                break;
                            case 4:
                                rtaCanBas = lP.cantElementosLista();
                                System.out.println("\n Cantidad de canciones en su playlist: " +rtaCanBas);
                                System.out.println("\n Presione cualquier tecla numerica para continuar...");
                                teclado.nextInt();
                                break;
                            case 5:
                                break;
                        }


                    }while(opcionP != 5);
                    break;//opcion 3 para salir
            }
        }while(opcion != 3);
        teclado.close();
    }
}
