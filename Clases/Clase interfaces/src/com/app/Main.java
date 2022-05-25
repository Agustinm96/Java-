package com.app;

public class Main {

    public static void main(String[] args) {
        I_LanzarFuego piromano = new Piromano();
        I_LanzarFuego dragon = new Dragon();

        System.out.println(dragon.lanzarFuego());

        if(dragon instanceof Dragon) //utilizamos instance of para hacer un casteo "seguro" y no castear un elemento que no sea dragon
        {
            Dragon aux = (Dragon) dragon; //casteo
            System.out.println(aux.soyDragon());  //aparece un metodo de la clase dragon (casteo bien hecho)
        }
    }
}
