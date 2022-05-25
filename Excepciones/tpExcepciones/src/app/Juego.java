package app;

import java.util.ArrayList;

public class Juego {
    private int num;
    private int cantIntentos;

    public Juego()
    {
        cantIntentos = 1;
        num = (int)(Math.random()*(10-1)) + 1;
    }

    public boolean adivinar(int numero) throws NumeroIncorrecto
    {
        if (numero != num)
            throw new NumeroIncorrecto("El numero no es correcto.");
        return true;
    }

    public void incCantIntentos() {
        cantIntentos++;
    }

    public int getCantIntentos() {
        return cantIntentos;
    }
}
