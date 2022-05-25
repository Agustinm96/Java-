package com.holamundo;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        String palabra = "agustin";


        /**-------------------------------------Length---------------------------------------------------------**/


        /**Longitud**/
        int longitud = palabra.length();
        System.out.println("\n La longitud es: " + longitud);



        /**--------------------------------------IndexOf--------------------------------------------------------**/



        /**Indexof**/
        //devuelve la prposicion de la primera aparicion de ese caracter
        int rta = palabra.indexOf('n');
        System.out.println("\n La primera aparición del caracter n en la palabra, es en la posición: " +rta);

        //devuelve la ultima aparicion de ese carcacter.
        int rta2 = palabra.lastIndexOf('i');
        System.out.println("\n La ultima aparición del caracter i en la palabra, es en la posición: " +rta2);



        /**------------------------------------charAt----------------------------------------------------------**/



        /**charAt(n)**/
        //devuelve el caracter que esta en la posicion n
        char a = palabra.charAt(3);
        System.out.println("\n: " +a);



        /**----------------------------------------Substring-------------------------------------------------**/



        /**substring**/
        String rta3 = palabra.substring(1);//devuelve la palabra desde la posicion 1 en adelante "gustin";
        System.out.println("\n" +rta3);
        String rta4 = palabra.substring(0, 1);//devuelve la palabra desde la posicion 0 a la 1 "a".
        System.out.println("\n" +rta4);



        /**----------------------------------------Lower/Upper Case------------------------------------------**/



        /**toUpperCase**/
        //transforma todo en mayuscula
        String modificacion = palabra.toUpperCase();
        System.out.println("\n" +modificacion);

        /**toLowerCase**/
        //transforma todo en minuscula
        String password = "AGUSTIN";

        System.out.println("\n" +password.toLowerCase());



        /**------------------------------------------EQUALS--------------------------------------------------**/



        /**.equals(string) compara un string con otro**/
        String pruebaEquals = "AGUSTIN";
        if (palabra.toLowerCase().equals("agustin")) {
            System.out.println("\n Son iguales");
        }
        else
            System.out.println("\n Son palabras diferentes.");



        /**equalsIgnoreCase(string) igual que equals pero no tiene en cuenta mayusculas y minusculas**/
        if (palabra.equalsIgnoreCase("AgusTIN"))
            System.out.println("\n Son iguales");
        else
            System.out.println("\n Son palabras diferentes.");



        /**---------------------------------------Contains-------------------------------------------------------**/


        if (palabra.contains("gus")) //devuelve true or false
        {
            System.out.println("\n Verdadero.");
        }
        else
            System.out.println("\n Falso");


        /**---------------------------------------Trim-------------------------------------------------------**/

        String nuevaPalabra = "Matematica        ";
        String palabraSinEspacios = nuevaPalabra.trim(); //elimina los espacions del principio o final, pero no del medio.
        System.out.println("\n " +palabraSinEspacios);


        /**--------------------------------------compareTo---------------------------------------------------**/

        String palabra1 = "Matematica";
        int rta5 =palabra1.compareTo(palabraSinEspacios); //compara si las cadenas son iguales, si es asi devuelve 0 (iguales), 1(primera>segunda) o -1(primera<segunda)**/
        System.out.println("\n" +rta5);
        //compreToIgnoreCase (compara dos strings sin considerar mayus o minus).


        /**------------------------------------StringBuilder-------------------------------------------------**/

        //Permite concatenar palabras sin generar nuevos espacios de memoria. Es decir, se pueden modificar Strings sin generar
        //nuevos espacios de memoria. Similares a los strings porque gestionan conjunto de caracteres.
        /**Metodos importantes del sb:
         - append
         -charAt = devuelve caracter indicado por indice (primera posicion =0)
         -setCharAt = cambia el caracter de la posicion index al valor que se indica por parámetro
         -delete = elimina los caracrteres desde y hasta las posiciones indicadas por parámetro. Devuelve referncia de si mismo
         -insert = inserta el string pasado por param en la posicion especificada. Devuelve referencia de si mismo
         -reverse = invierte los caracteres, devuelve una referencia de si mismo.
         -toString =
         **/


        StringBuilder sb = new StringBuilder("hola");
        sb.append("mundo"); //concatena hola mundo. Adjunta al final. Devuelve una referencia a si mismo.
        System.out.println("\n" +sb);
        System.out.println("\n" +sb.charAt(1));//o
        sb.setCharAt(1,'O');
        System.out.println("\n" +sb);
        System.out.println("\n"+sb.delete(0,4));
        sb.insert(0, 'M');
        System.out.println("\n" +sb);
        System.out.println("\n" +sb.reverse());


    }
}
