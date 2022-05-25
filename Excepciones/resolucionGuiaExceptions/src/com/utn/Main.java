package com.utn;

import com.utn.colegio.Alumno;
import com.utn.colegio.Colegio;
import com.utn.colegio.Nacionalidad;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /**  Ejercicio 3.*/
//        Game game = new Game();
//        while (!game.isHit()) {
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Enter number:");
//            String num = scanner.nextLine();
//            game.userAttempt(num);
//        }
//        System.out.println("Winner winner chicken dinner, el num era:" + game.getNumber());
//        System.out.println("Te tomo " + game.getAttempts() + " intentos.");
        /** Ejercicio 4.*/
        Alumno alumno = new Alumno("Juan", Nacionalidad.COLOMBIANO);
        Alumno alumno2 = new Alumno("Maria", Nacionalidad.BRASILERO);
        Alumno alumno3 = new Alumno("Pepe", Nacionalidad.VENEZOLANO);
        Alumno alumno4 = new Alumno("Maria", Nacionalidad.BRASILERO);
        Alumno alumno5 = new Alumno("", Nacionalidad.PARAGUAYO);

        List<Alumno> alumnos = new ArrayList<>();


        Colegio colegio = new Colegio();
        colegio.agregarAlumno(alumno);
        colegio.agregarAlumno(alumno2);
        colegio.agregarAlumno(alumno3);
        colegio.agregarAlumno(alumno4);
        colegio.agregarAlumno(alumno5);

        colegio.cuantos();
        System.out.println("------------------------------------");
        colegio.verNacionalidad(Nacionalidad.ARGENTINO.toString());
        System.out.println("------------------------------------");
        colegio.verTodos();
        System.out.println("------------------------------------");
        colegio.borrarAlumno(alumno);
        System.out.println("------------------------------------");
        colegio.verTodos();
    }


}
