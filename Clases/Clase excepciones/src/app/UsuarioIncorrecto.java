package app;

public class UsuarioIncorrecto extends Exception {
    private int cantidadIntentos;

    public UsuarioIncorrecto(String message, int cantidadIntentos) {
        super(message);
        this.cantidadIntentos = cantidadIntentos;
    }

    public int getCantidadIntentos() {
        return cantidadIntentos;
    }

    @Override
    public String getMessage() {
        return super.getMessage() + "Cantidad de intentos: " +getCantidadIntentos();
    }
}
