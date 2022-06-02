import java.util.ArrayList;
import java.util.Scanner;

public class Cancion {
    static Scanner teclado;
    private String titulo;
    private ArrayList<Artista>artistas;
    private String album;
    private double duracion;
    private String genero;


    public Cancion (String t, String al, double d, String g){
        titulo = t;
        artistas = new ArrayList<>();
        album = al;
        duracion = d;
        genero = g;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAlbum() {
        return album;
    }

    public double getDuracion() {
        return duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void cargarArtistasTeclado (){
        int continuar=1;
        teclado = new Scanner(System.in);

        while(continuar==1){
            System.out.println("\n Ingrese el nombre del artista: ");
            Artista aux = new Artista(teclado.nextLine());
            artistas.add(aux);

            System.out.println("\n Desea continuar?");
            continuar = teclado.nextInt();
            teclado.nextLine();
        }
    }

    public ArrayList<Artista> getArtistas() {
        return artistas;
    }

    public int cantArtistas(){
        return artistas.size();
    }

    public StringBuilder mostrarArtistas (){
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<artistas.size();i++) {
            sb.append(artistas.get(i));
        }
        return sb;
    }


    @Override
    public String toString() {
        return "\n Cancion: "+getTitulo() + mostrarArtistas() +"\n Album:" + getAlbum() + "\n Duracion: " +getDuracion() +" minutos" + "\n Genero: " + getGenero();
    }
}
