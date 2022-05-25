package app;

import java.util.Scanner;

public class Main {
    static Scanner teclado;
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cantidad = 1;
        boolean rta = false;

        while(!rta){
            try {
                System.out.println("Ingrese usuario: ");
                rta = login(teclado.nextLine(), "1221", cantidad);
            } catch (UsuarioIncorrecto e) {
                System.out.println(e.getMessage());

            }
            catch (PassIncorrecta e){
                cantidad++;
            }
            finally {
                System.out.println("FIN");
            }
        }


        //login2("agus","1223");


    }
    public static boolean login (String a, String pass, int cantIntentos) throws UsuarioIncorrecto, PassIncorrecta{//propaga excepcion
        if(!a.equalsIgnoreCase("admin")){
            throw new UsuarioIncorrecto("no sos admin", cantIntentos);
        }
        if(!pass.equalsIgnoreCase("1257")){
            throw new PassIncorrecta("Contraseña incorredcta");
        }
        return true;
    }

    public static void login2 (String a, String p){
        try{
            if(!a.equalsIgnoreCase("admin")){
                throw new Exception("no sos admin");
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
