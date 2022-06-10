import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Usuario user = Controladora_Usuario.altaUsuario();

        System.out.println(user.toString());



    }
}