import org.json.JSONArray;
import org.json.JSONException;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class ListaUsuarios implements I_FuncionalidadBasicaListaUsuarios, Serializable {
    static Scanner teclado;
    private ContenedorUsuarios<Usuario> listaUsuarios;

    public ListaUsuarios() {
        listaUsuarios = new ContenedorUsuarios<>();
    }

    @Override
    public boolean agregarUsuario(Usuario usuarioNuevo) {
        boolean rta1 = false, rta2 = false;
        teclado = new Scanner(System.in);
        while(!(rta1 && rta2)){ /**Se fija si ya existe un nombre de usuario o una cuenta con el dni del usuario nuevo**/
            while(!rta1){
                rta1 = buscarUsuarioPorNombre(usuarioNuevo.getNombreUsuario());
                if(!rta1){
                    System.out.println("Nombre ya existe, ingrese otro.");
                    usuarioNuevo.setNombreUsuario(teclado.nextLine());
                }
            }
            while(!rta2){
                rta2 = buscarUsuarioPorDNI(usuarioNuevo.getDNI());
                if(!rta2){
                    System.out.println("\n DNI ya se encuentra registrado con una cuenta. Ingrese otro o en el menú de inicio recupere su cuenta"); /**CREAR OPCION DE RECUPERO DE CUENTA CUANDO NO SE ACURERDA DNI**/
                    usuarioNuevo.setDNI(teclado.nextLine());
                }
            }
        }

        return listaUsuarios.agregarElemento(usuarioNuevo);
    }

    @Override
    public boolean bajaUsuario(Usuario aDarBaja) {
        return listaUsuarios.bajaElemento(aDarBaja);
    }

    @Override
    public Usuario bajaUsuario(int index) {
        return listaUsuarios.bajaElemento(index);
    }

    @Override
    public String listarUsuario() {
        return listaUsuarios.listarElementos();
    }

    @Override
    public Usuario buscarUsuario(int index) {
        return listaUsuarios.buscarElemento(index);
    }

    /**
     * Busca si el nombre ingresado por teclado para un nuevo usuario ya existe
     * @param nombreUsuario
     * @return true = no existe ; false = existe
     */

    @Override
    public boolean buscarUsuarioPorNombre(String nombreUsuario) {
        boolean rta = false;
        if(listaUsuarios.cantidadElementos()>0){
            for(int i=0;i<listaUsuarios.cantidadElementos();i++){
                if(!listaUsuarios.buscarElemento(i).getNombreUsuario().equals(nombreUsuario)){
                    rta = true;
                }
            }
        }else {
            rta = true;
        }
        return rta;
    }



    /**
     * Busca si el dni ingresado por teclado para un nuevo usuario ya existe
     * @param dniUsuario
     * @return true =  no  existe ; false = existe
     */

    public boolean buscarUsuarioPorDNI(String dniUsuario) {
        boolean rta = false;
        if(listaUsuarios.cantidadElementos()>0){
            for(int i=0;i<listaUsuarios.cantidadElementos();i++){
                if(!listaUsuarios.buscarElemento(i).getDNI().equals(dniUsuario)){
                    rta = true;
                }
            }
        }else {
            rta = true;
        }
        return rta;
    }

    public int cantElementos(){
        return listaUsuarios.cantidadElementos();
    }

    /**
     * Metodo para devolver toods los usuarios
     * @return los usuarios en un ArrayList
     */
    public ArrayList<Usuario> devolverUsuarios() {
        ArrayList<Usuario> lista_Usuarios = new ArrayList<>();

        for(int i = 0 ; i < listaUsuarios.cantidadElementos() ; i++) {
            lista_Usuarios.add(listaUsuarios.buscarElemento(i));
        }

        return lista_Usuarios;
    }

    /**
     * Devulve todos los clientes con su nombre, apellido y dni
     * @return los datos de los usuarios en forma de String
     */

    public String devolverClientesConSuNombreApellidoYDni() {
        StringBuilder sb = new StringBuilder();

        ArrayList<Usuario> usuarios = devolverUsuarios();

        for (Usuario uS : usuarios) {
            sb.append(uS.getDNI()+" - "+uS.getNombre()+" "+uS.getApellido()+"\n");
        }

        return sb.toString();
    }

    /**
     * Convierte la lista de usuarios en un arreglo de JSON
     * @return un JSONArray con los usuarios
     * @throws JSONException
     */
    public JSONArray toJsonArray() throws JSONException {
        JSONArray jsonArray = new JSONArray();

        for(int i = 0 ; i < listaUsuarios.cantidadElementos() ; i++ ) {
            jsonArray.put(listaUsuarios.buscarElemento(i).toJSONObject());
        }

        return jsonArray;
    }

    /**FALTA METODO PARA IMPORTAR DESDE JSON**/


}
