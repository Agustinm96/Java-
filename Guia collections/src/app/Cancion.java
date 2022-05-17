package app;

import java.util.Objects;

public class Cancion {
    private int id;
    private String nombreArtista;
    private String nombre;
    private String duracion;
    private String genero;
    private String albumPertenece;
    private String artistaInvitado;

    public Cancion (int idC, String nA, String n, String d, String g, String aP, String aI){
        id = idC;
        nombreArtista = nA;
        nombre = n;
        duracion = d;
        genero = g;
        albumPertenece = aP;
        artistaInvitado = aI;
    }

    public Cancion ()
    {
        nombreArtista = " ";
        nombre = " ";
        duracion= " ";
        genero = " ";
        albumPertenece = " ";
        artistaInvitado = " ";
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAlbumPertenece() {
        return albumPertenece;
    }

    public String getArtistaInvitado() {
        return artistaInvitado;
    }

    public String getDuracion() {
        return duracion;
    }

    public String getGenero() {
        return genero;
    }

    public String getNombreArtista() {
        return nombreArtista;
    }

    public String mostrarOnoAI()
    {
        if(getArtistaInvitado()==null)
        {
            return ".";
        }
        else
            return "\n ft: " +getArtistaInvitado();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cancion cancion = (Cancion) o;
        return Objects.equals(nombre, cancion.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    @Override
    public String toString() {
        return "\n Cancion: " + "\n Artista: " + nombreArtista + "\n Nombre: " + nombre + "\n Duracion: " + duracion + " minutos." +"\n Genero: " + genero + "\n Album: " + albumPertenece + mostrarOnoAI();
    }
}
