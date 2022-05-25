package com.holamundo;

public class Main {

    public static void main(String[] args) {

        Auto ferrari = new Auto("laFerrari", "Ferrari", 0);
        Auto bmw = new Auto("I328", "BMW", 0, 30000f);
        Auto Tesla = new Auto();

        System.out.println(bmw.getMarca());


        //ferrari.setKm(1000);
        System.out.println(ferrari.getIsNuevo());
        System.out.format("El precio del bmw es: %.2f", bmw.getPrecio());

        System.out.println("\n" +bmw.devolverInfo());


    }
}
