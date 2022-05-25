package com.app;

public class Piromano extends Persona implements I_LanzarFuego{
    @Override
    public String lanzarFuego() {
        return "Estoy lanzando fuego";
    }
}
