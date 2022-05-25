package com.utn.colegio;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Colegio {
    private List<Alumno> alumnos;
    Set<String> nacionalidades = new HashSet<String>();
    private int count = 0;

    public Colegio() {
        this.alumnos = new ArrayList<>();
    }

    public void agregarAlumno(Alumno alumno) {
        try {
            if (alumno.getNombre().isEmpty() || alumno.getNacionalidad().toString().isEmpty()) {
                throw new IllegalArgumentException();
            } else {
                alumnos.add(alumno);
                nacionalidades.add(alumno.getNacionalidad().toString());
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    public void verNacionalidad(String nacionalidad) {
        count = 0;
        for (Alumno a : alumnos) {
            if (a.getNacionalidad().toString().equals(nacionalidad))
                count++;
        }
        System.out.println("Nacionalidad:" + nacionalidad + " Cantidad de Alumnos:" + count);
    }

    public void cuantos() {
        System.out.println("Hay " + nacionalidades.size() + " diferentes nacionalidades en el colegio.");
    }

    public void borrarAlumno(Alumno alumno) {
        boolean isAlumno = false;
        try {
            for (Alumno a : alumnos) {
                if (a.getNombre().equals(alumno.getNombre()) && a.getNacionalidad().equals(alumno.getNacionalidad())) {
                    isAlumno = true;
                }
            }
            if (isAlumno) {
                alumnos.remove(alumno);
                System.out.println("Alumno eliminado");
            } else {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    public void verTodos() {
        for (String nacionalidad:nacionalidades){
            verNacionalidad(nacionalidad);
        }
    }

}
