package app;

public class Alumno {
    private String nombre;
    private Nacionalidad nacionalidad;

    public Alumno(String nombre, Nacionalidad nacionalidad){
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Nacionalidad getNacionalidad() {
        return nacionalidad;
    }

}
