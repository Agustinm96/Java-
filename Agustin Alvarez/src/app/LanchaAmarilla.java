package app;

public class LanchaAmarilla extends Barco{
    private float cantHoras;

    public LanchaAmarilla (String marca, String modelo, float combustible, float capCarga, String patente, int cantHorasP)
    {
        super(marca, modelo, combustible, capCarga, patente,20);
        cantHoras = cantHorasP;
    }

    public LanchaAmarilla ()
    {
        super();
        this.cantHoras = cantHoras;
    }

    public void setCantHoras(float cantHoras) {
        this.cantHoras = cantHoras;
    }

    public float getCantHoras() {
        return cantHoras;
    }

    @Override
    public String toString() {
        return super.toString() + " Por hora";
    }

    public float mandarDePescaLancha ()
    {
        float recaudado=0;
        if(this.getCantHoras()*this.getCapRecoleccion()<=this.getCapCarga())
            recaudado =  this.getCantHoras()*this.getCapRecoleccion();

            return recaudado;
    }
}
