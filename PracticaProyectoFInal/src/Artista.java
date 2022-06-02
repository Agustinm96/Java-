public class Artista {
    private String nombre;

    public Artista (String n){
        nombre = n;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "\n Artista: " +getNombre();
    }
}
