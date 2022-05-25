package app;

public class NacionalidadIncorrecta extends Exception{

    public NacionalidadIncorrecta(String message){
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
