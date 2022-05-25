package app;

import java.util.Scanner;

public class Main {
    public static Scanner teclado;
    public static Scanner teclado2;

    public static void main(String[] args) {
	teclado = new Scanner(System.in);
    teclado2 = new Scanner(System.in);

    Colegio c1 = new Colegio();
    Alumno a1 = new Alumno("Agustin", Nacionalidad.ARGENTINO);
        Alumno a2 = new Alumno("Mauro", Nacionalidad.CHILENO);
        Alumno a3 = new Alumno("Alvarez", Nacionalidad.COLOMBIANO);
        Alumno a4 = new Alumno("Piero", Nacionalidad.BRASILERO);
        Alumno a5 = new Alumno("", Nacionalidad.BRASILERO);


        boolean rta = false;
        while(!rta){
            System.out.println("\n Ingrese nombre: ");
            String nombreAL = teclado.nextLine();

            Alumno aux = new Alumno(nombreAL, Nacionalidad.ARGENTINO);
            rta = c1.agregarAlumno(aux);
        }

        c1.agregarAlumno(a1);
        c1.agregarAlumno(a2);
        c1.agregarAlumno(a3);
        c1.agregarAlumno(a4);
        c1.borrar(a1);
        c1.verTodos();
        System.out.println("Cantidad de alumnos de distinta nacionalidad: " +c1.cuantos());





    }
}
