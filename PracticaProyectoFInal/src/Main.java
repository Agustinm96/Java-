public class Main {
    public static void main(String[] args) {


        Cancion c1 = new Cancion("Goteo", "A la espera", 3.17, "TRAP");
        Cancion c2 = new Cancion("Chance", "Leones con Flow", 2.50, "POP");
        Cancion c3 = new Cancion("Tranquila", "Los del espacio", 3.45, "TRAP");
        Cancion c4 = new Cancion( "Jordan", "23",2.37, "REGUEATON");
        Cancion c5 = new Cancion("Wonderwall", "album",3.20, "POP");
        Cancion c6 = new Cancion( "Rock & roll", "Will",3.20, "ROCK");
        c1.cargarArtistasTeclado();

        System.out.println(c1.toString());





    }
}