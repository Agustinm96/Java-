package com.app;

public class Dragon implements I_LanzarFuego{
    @Override
    public String lanzarFuego() {
        return "Soy un dragon lanzando fuego";
    }

    public boolean soyDragon ()
    {
        return true;
    }
}
