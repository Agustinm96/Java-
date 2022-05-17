package app;

import java.util.Objects;

public class Barco {
    private String marca;
    private String modelo;
    private float capCombustible; //capacidad combustible
    private float capCarga; //capacidad carga
    private String patente;
    private float capRecoleccion;

    public Barco ()
    {
        this.marca = "vacio";
        this.modelo = "vacio";
        this.capCombustible = 0;
        this.capCarga = 0;
        this.patente = "vacio";
        this.capRecoleccion = 20;
    }

    public Barco(String marcaP, String modeloP, float capCombustibleP, float capCargaP, String patenteP, float capRecoleccionP)
    {
        marca = marcaP;
        modelo = modeloP;
        capCombustible = capCombustibleP;
        capCarga = capCargaP;
        patente = patenteP;
        capRecoleccion = capRecoleccionP;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCapRecoleccion(float capRecoleccion) {
        this.capRecoleccion = capRecoleccion;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCapCarga(float capCarga) {
        this.capCarga = capCarga;
    }

    public void setCapCombustible(float capCombustible) {
        this.capCombustible = capCombustible;
    }


    public void setPatente(String patente) {
        this.patente = patente;
    }

    public float getCapCarga() {
        return capCarga;
    }

    public float getCapCombustible() {
        return capCombustible;
    }


    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPatente() {
        return patente;
    }

    public float getCapRecoleccion() {
        return capRecoleccion;
    }

    /**---------------------------------------------------------------------------------------------------------**/


    /**Sobreescribo funcion equals para comparar patentes de diferentes barcos:**/
    @Override //comparo si patentes de barco son iguales para diferenciarlos
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Barco barco = (Barco) o;
        return patente.equals(barco.patente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(patente);
    }

    /**---------------------------------------------------------------------------------------------------------**/

    /**Sobreescribo funcion ToString para mostrar info del barco:**/
    @Override //imprime info del barco
    public String toString() {
        return "\n Marca: " +getMarca() + "\n Modelo: " +getModelo() + "\n Capacidad de combustible: " +getCapCombustible() + "\n Capacidad de carga: "+getCapCarga() + "\n Patente: "+getPatente() + "\n Capacidad de recoleccion: " +getCapRecoleccion();
    }

    /**---------------------------------------------------------------------------------------------------------**/

    /**Funcion para mandar a pescar un barco sea corbeta o lancha amarilla**/
    public float mandarDePesca (Barco e)
    {
        float recaudado = 0;
        if(e instanceof LanchaAmarilla)
        {
            if(e.getCapRecoleccion()*((LanchaAmarilla) e).getCantHoras()<=e.getCapCarga())
               recaudado = e.getCapRecoleccion()*((LanchaAmarilla) e).getCantHoras();
        }

        if(e instanceof Corbeta)
        {
            if(e.getCapRecoleccion()*((Corbeta) e).getCantJaulas()<=e.getCapCarga())
            recaudado = e.getCapRecoleccion()*((Corbeta) e).getCantJaulas();
        }
    return recaudado;
    }







}
