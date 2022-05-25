package app;

public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int e) {
        this.nombre = nombre;
        edad = e;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

}
