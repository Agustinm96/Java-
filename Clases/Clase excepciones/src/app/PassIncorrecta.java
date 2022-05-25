package app;

public class PassIncorrecta extends Exception{


    public PassIncorrecta (String message){
        super(message);

    }


    @Override
    public String getMessage() {
        return super.getMessage();
    }


}
