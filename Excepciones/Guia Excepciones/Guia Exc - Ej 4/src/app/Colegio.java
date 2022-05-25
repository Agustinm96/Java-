package app;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Colegio {
    private ArrayList<Alumno> listaAlumnos;
    private Set<String>nacionalidades;


    public Colegio(){
        listaAlumnos = new ArrayList<Alumno>();
        nacionalidades = new HashSet<String>();
    }

    /*agregarAlumno(Alumno alumno): añade la nacionalidad de un nuevo
    alumno
    verNacionalidad(String nacionalidad): Muestra la nacionalidad y el número de
    alumnos de esa nacionalidad
    cuantos(): Muestra cuántas nacionalidades diferentes existen en el colegio.
    borrar(Alumno alumno): Elimina los datos insertados.
    VerTodos(): Muestra las distintas nacionalidades y el número de alumnos que
    existen por nacionalidad.*/

    public boolean agregarAlumno (Alumno alumno){
        boolean rta = false;
        try{
           if(alumno.getNacionalidad().toString().isEmpty()){
               throw new NacionalidadIncorrecta("\n Completar campo vacio");
           }
           else if(alumno.getNombre().isEmpty()){
               throw new NombreIncorrecto("\n Completar nuevamente");
           }
           else
           {
               rta = true;
               listaAlumnos.add(alumno);
               nacionalidades.add(alumno.getNacionalidad().toString());
           }
       }
       catch(NacionalidadIncorrecta | NombreIncorrecto e){
           System.out.println(e.getMessage());

       }
        return rta;
    }

    public void verNacionalidad (String nacionalidad){
        int i=0, rta=0;
        for(Alumno a: listaAlumnos){
            if(a.getNacionalidad().toString().equals(nacionalidad)){
                rta++;
            }
        }


        System.out.println("Nacionalidad:" + nacionalidad + " Cantidad de Alumnos:" + rta);
    }

    public int cuantos(){
        return nacionalidades.size();
    }

    public int borrar (Alumno al){
        int rta=0;
        boolean existeOno = false;

        try{
            for(Alumno a :listaAlumnos) {
                if (a.getNombre().equals(al.getNombre()) && a.getNacionalidad().equals(al.getNacionalidad())) {
                    existeOno = true;
                }
            }
                if(existeOno){
                    listaAlumnos.remove(al);
                    rta++;
                } else{
                    throw new AlumnoIncorrecto("\n Alumno inexistente.");
                }
        }
        catch (AlumnoIncorrecto e){
            System.out.println(e.getMessage());
        }
        return rta;
    }

    public void verTodos(){
        for(String nacionalidad : nacionalidades){
            verNacionalidad(nacionalidad);
        }
    }
}
