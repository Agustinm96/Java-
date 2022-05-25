package app;

import java.util.Scanner;

public class Main {
        static Scanner teclado;
    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        Juego j1 = new Juego();
        boolean rta = false;
        int ing=0;

        while(!rta){
            try{
                System.out.println("\n Ingrese un numero: ");
                rta = j1.jugar(teclado.nextInt());
            }catch (NumeroIncorrecto e){
                System.out.println(e.getMessage() + " Cantidad de intentos: " +j1.getCantIntentos());
            }catch (Exception e){
                System.out.println(e.getMessage()+ " Cantidad de intentos: " +j1.getCantIntentos());
            }finally {
                if(rta)
                System.out.println("\n Felicitaciones, te tomo una cantidad de " +j1.getCantIntentos() + " intentos.");
            }

        }




    }
}
