import java.util.ArrayList;
import java.util.Scanner;

public class Controladora_Usuario {
    static Scanner teclado;

    private ArrayList<Usuario> listaUsuarios;

    public Controladora_Usuario(){
        listaUsuarios = new ArrayList<>();
    }

    public static Usuario altaUsuario (){              /**VALIDACIONES**/
        teclado = new Scanner(System.in);

        System.out.println("\n Complete los siguientes campos por favor: ");

        System.out.println("\n Nombre: ");
        String nombre_Persona = teclado.nextLine();

        System.out.println("\n Apellido: ");
        String apellido_Persona = teclado.nextLine();

        System.out.println("\n DNI: ");
        String dni_Persona = teclado.nextLine();

        System.out.println("\n Edad: ");
        int edad_Persona = teclado.nextInt();

        teclado.nextLine();

        System.out.println("\n Fecha de nacimiento: ");
        String fechaNac_Persona = teclado.nextLine();

        System.out.println("\n Genero: ");
        int genero_Persona = teclado.nextInt();

        System.out.println("\n Nombre de usuario: ");
        String nombre_Usuario = teclado.nextLine();

        System.out.println("\n Clave: ");
        String clave_Usuario = teclado.nextLine();

        System.out.println("\n Email: ");
        String mail_Usuario = teclado.nextLine();

        System.out.println("\n Telefono: ");
        String telefono_Usuario = teclado.nextLine();

        Usuario user = new Usuario(nombre_Persona, apellido_Persona, dni_Persona,edad_Persona,fechaNac_Persona,genero_Persona,nombre_Usuario,clave_Usuario,mail_Usuario,telefono_Usuario);

        return user;
    }
}
