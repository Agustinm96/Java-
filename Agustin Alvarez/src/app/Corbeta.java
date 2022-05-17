package app;

public class Corbeta extends Barco{
    private int cantJaulas; //cantidad de jaulas

    public Corbeta(String marca, String modelo, float combustible, float capCarga, String patente, int cantJaulasP)
    {
        super(marca, modelo, combustible, capCarga, patente,10);
        cantJaulas = cantJaulasP;
    }

    public Corbeta()
    {
        super();
        this.cantJaulas=0; //luego seteo cant de jaulas
    }

    public void setCantJaulas(int cantJaulas) {
        this.cantJaulas = cantJaulas;
    }

    public int getCantJaulas() {
        return cantJaulas;
    }

    @Override
    public String toString() {
        return super.toString() + " Por jaula" + "\n Cantidad de jaulas: "+ getCantJaulas();
    }
}
