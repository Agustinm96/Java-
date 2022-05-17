package app;

public class Main {

    public static void main(String[] args) {

        /**Creacion del puerto**/
        Puerto p1 = new Puerto();



        /**----------------------------------------CARGA MANUAL DE BARCOS------------------------------------------**/



        /**------------------------------------------------Barco 1-------------------------------------------------**/
        LanchaAmarilla l1 = new LanchaAmarilla("Pescadito", "PescadoMax", 30, 60, "ABC 123", 3);
        p1.cargarBarco(l1); //agrego lancha a listas de barco del puerto.

        /**------------------------------------------------Barco 2-------------------------------------------------**/
        Corbeta c1 = new Corbeta("Pescadito", "PescadoMax 2.0",50,80, "MMM 820", 5);
        p1.cargarBarco(c1);

        /**------------------------------------------------Barco 3-------------------------------------------------**/
        Corbeta c2 = new Corbeta("Pescadito", "PescadoMax 3.0",50,90, "IRG 186", 7);
        p1.cargarBarco(c2);

        /**------------------------------------------------Barco 4-------------------------------------------------**/
        LanchaAmarilla l2 = new LanchaAmarilla("Pescadito", "Fish Hunter", 10, 30, "LMN 250", 3);
        p1.cargarBarco(l2);


        /**------------------------------------------------Barco 5-------------------------------------------------**/

        LanchaAmarilla l3 = new LanchaAmarilla();
        l3.setMarca("Pescado Atrapado");
        l3.setModelo("Pescadotecnia");
        l3.setCapCarga(150);
        l3.setCapCombustible(60);
        l3.setPatente("AB 156 HE");
        l3.setCapRecoleccion(10);
        p1.cargarBarco(l3);


        /**---------------------------------------------------------------------------------------------------------**/

        /**Muestra arreglo de barcos**/

        p1.muestraArregloBarcos();

        /**---------------------------------------------------------------------------------------------------------**/

        /**Funcion para mandar a pescar, ejemplificada con el barco 4 que excede la capacidad de carga (l2)**/
        float rta = p1.getListaBarcos()[4].mandarDePesca(p1.getListaBarcos()[4]);
        if(rta==0)
            {
                System.out.println("\n No se puede mandar a pescar al barco durante tantas horas, debe modificar esa orden!!!");
        }
        else
        {
            System.out.println("\n El barco a vuelto con: " +rta + " kilos de merluza");
        }

        /**---------------------------------------------------------------------------------------------------------**/

        /**Prueba funcion de calculo total de recoleccion de todos los barcos en el puerto**/

        float rta2 = p1.calculaTotalRecolectadoDeTodosLosBarcos();
        System.out.println("\n El total de kilos de merluza obtenido por todos los barcos es de: " +rta2 + " kilos");

        /**---------------------------------------------------------------------------------------------------------**/


        /**Prueba funcion de calculo de dinero racudado por todos los barcos del arreglo:**/

        float rta3 = p1.calculaRecaudadoDineroTotal();
        System.out.println("\n El dinero recaudado por todos los barcos es de: " +rta3 + " dolares");

        /**---------------------------------------------------------------------------------------------------------**/

        /**Prueba funcion de calculo de dinero racudado por barco:**/
        float rta4 = p1.caluclaDineroPorBarco(0);
        System.out.println("\n El dinero recaudado por el barco es de: " +rta4 + " dolares");







    }
}
