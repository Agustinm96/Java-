package app;

public class Puerto {
    private Barco[] listaBarcos; //arreglo de barcos
    private int validosBarco;
    private String tipoPescado;
    private float precioPescado;

    public Puerto ()
    {
        this.listaBarcos = new Barco[100];
        this.validosBarco = 0;
        tipoPescado = "Merluza";
        precioPescado = 11;
    }


    //si en algun momento se quiere modificar el precio del pescado
    public void setPrecioPescado(float precioPescado) {
        this.precioPescado = precioPescado;
    }

    public float getPrecioPescado() {
        return precioPescado;
    }

    public String getTipoPescado() {
        return tipoPescado;
    }

    public int getValidosBarco() {
        return validosBarco;
    }

    public Barco[] getListaBarcos() {
        return listaBarcos;
    }


    /**---------------------------------------------------------------------------------------------------------**/

    public Barco[] cargarBarco(Barco b) {
        listaBarcos[getValidosBarco()]=b;
        this.validosBarco++;

        return listaBarcos;
    }

    /**---------------------------------------------------------------------------------------------------------**/

    public float calculaTotalRecolectadoDeTodosLosBarcos ()
    {
        float recaudado=0;
        for(int i=0;i<this.validosBarco;i++)
        {
            recaudado += listaBarcos[i].mandarDePesca(listaBarcos[i]);
        }
        return recaudado;
    }

    /**---------------------------------------------------------------------------------------------------------**/

    /**Funcion para devolver la cantidad de dinero recaudado por todos los barcos del puerto:**/

    public float calculaRecaudadoDineroTotal ()
    {
        float resultado = calculaTotalRecolectadoDeTodosLosBarcos();

        return resultado * getPrecioPescado();
    }

    /**Funcion para devolver la cantidad de dinero recaudado por un barco determinado, pasandole por parametro la posicion:**/

    public float caluclaDineroPorBarco (int posicion)
    {
        float resultado = listaBarcos[posicion].mandarDePesca(listaBarcos[posicion]);

        return resultado * getPrecioPescado();
    }

    /**---------------------------------------------------------------------------------------------------------**/

    public void muestraArregloBarcos ()
    {
        for(int i=0;i<this.getValidosBarco();i++)
        {
            System.out.println(this.getListaBarcos()[i].toString());
        }
    }


}
