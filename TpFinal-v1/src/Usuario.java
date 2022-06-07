public class Usuario extends Persona {

    private int id; //unico atributo que tanto admin como usuario no pueden modificar
    private String nombreUsuario;
    private String clave;
    private String mail;
    private String telefono;
    private int estado; //1 - Habilitado ; 0 - Deshabilitado
    //playList

    public Usuario (String nombreP, String apellidoP, String dniP, int edadP, String fechaNacP, int generoP, String nombre_Usuario, String clave_Usuario, String mail_Usuario, String telefono_Usuario){

        super(nombreP,apellidoP,dniP,edadP,fechaNacP,generoP);
        //id = verMaquinaExpendedora (metodo autoincremental)
        nombreUsuario = nombre_Usuario;
        clave = clave_Usuario;
        mail = mail_Usuario;
        telefono = telefono_Usuario;
        estado = 1; //al crearse está habilitado
    }

    public Usuario (){
        super("", "", "", 0, "", 0);
        //this.id =
        this.nombreUsuario = "";
        this.clave = "";
        this.mail = "";
        this.telefono = "";
        this.estado = 1;

    }

    /*public int getId() {
        return id;
    }*/

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    /*@Override
    public String toString() {
        return  super.toString() + "\n Id de usuario:" +g\n Usuario: " +getNombreUsuario() + +
                ", nombreUsuario='" + nombreUsuario + '\'' +
                ", clave='" + clave + '\'' +
                ", mail='" + mail + '\'' +
                ", telefono='" + telefono + '\'' +
                ", estado=" + estado +
                '}';
    }*/
}
