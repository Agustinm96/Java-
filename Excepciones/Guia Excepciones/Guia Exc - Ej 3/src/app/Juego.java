package app;

public class Juego {
    private int nro;
    private int cantIntentos;

    public Juego(){
        nro = (int) (Math.random()*500+1);
        cantIntentos=0;
    }

    public int getCantIntentos() {
        return cantIntentos;
    }

    public boolean jugar (int nroIngresado)throws NumeroIncorrecto{
    this.cantIntentos++;
        if(nroIngresado!=nro){
            if(nroIngresado<nro){
                System.out.println("\n El numero ingresado es menor.");
            }
            else
            {
                System.out.println("\n El numero ingresado es mayor.");
            }
            throw new NumeroIncorrecto("\n Numero incorrecto!!");
        }
        return true;
    }
}
