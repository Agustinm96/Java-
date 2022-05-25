package com.holamundo;

import java.util.Locale;

public class Auto {
    private String modelo;
    private String marca;
    private String patente;
    private float precio;
    private int km;




    /**si no se cambio orden tipo y/o cantidad no se puede utilizar polimorfismo.**/



    /**constructor vacio**/
    public Auto ()
    {
        modelo = "";
        marca = "";
        precio = 0; //con el 0 no necesita el f al lado del numero
        km = 0;
    }

    public Auto (String modelo, String marca, int km)
    {
        this.modelo = modelo; //this = mi modelo (modelo del auto) es igual al modelo enviado por parametro, se usa el this porque
                                //utiliza el mismo nombre
        /** modelo = modeloP; //si hubiese un parametro llamado modeloP;**/

        this.marca = marca;
        this.km=km;
    }

    public Auto (String modelo, String marca, int km, float precioP)
    {
        this.modelo = modelo; //this = mi modelo (modelo del auto) es igual al modelo enviado por parametro, se usa el this porque
        //utiliza el mismo nombre
        /** modelo = modeloP; //si hubiese un parametro llamado modeloP;**/

        this.marca = marca;
        this.km=km;

        precio = precioP;
    }
    /**GETers y SETer**/
    public String getMarca()
    {  String output = marca.substring(0,1).toUpperCase() + marca.substring(1).toLowerCase(); //primera letra en mayuscula, y concatena el resto
        //substring (parametro 1 (inicio) en este caso 0, y final es el caracter sigueinte (2do parametro) en mayuscula y si es un solo parameotr es el resto del string
        //por eso al final concatena el resto, pero en minúscula.
        return output;
    }

    public String devolverInfo ()
    {
        return getMarca() + " " + getModelo();
    }

    public float getPrecio() {
        return precio;
    }

    public String getPatente() {
        return patente;
    }

    public String getModelo() {
        return modelo;
    }

    public boolean getIsNuevo()
    {
        if(km>0)
            return false;
        else
            return true;

    }

    public int getKm() {
        return km;
    }

    public void setModelo(String modelo)
    {
     this.modelo = modelo;
    }

    public void setKm(int km) {
        this.km = km;
        }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}