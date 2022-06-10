import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Usuario user = Controladora_Usuario.altaUsuario();
        ListaUsuarios listaDeUsario = new ListaUsuarios();

        System.out.println(listaDeUsario.agregarUsuario(user));
        Usuario user1 = Controladora_Usuario.altaUsuario();
        System.out.println(listaDeUsario.agregarUsuario(user1));











    }
}