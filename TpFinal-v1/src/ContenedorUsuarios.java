import java.io.Serializable;
import java.util.ArrayList;

/**
 * Contenedor generico que esta pensado para abstraer el comportamiento del
 * ArrayList.
 *
 * @author Agustin
 * @param <T> Tipo de dato esperodo por el objeto.
 */
public class ContenedorUsuarios <T> implements Serializable {
    private ArrayList<T>contenedor;

    /**
     * Constructor de Contenedor de Usuarios
     */
    public ContenedorUsuarios() {

        contenedor = new ArrayList<T>();
    }

    /**
     * Agrega un elemento al ArrayList
     *
     * @param elemento
     * @return boolean Retorna True si se agrego el elemento, False en caso
     *         contrario
     */
    public boolean agregarElemento(T elemento) {
        return contenedor.add(elemento);
    }


    /**
     * Quita un elemento del ArrayList por el contenido
     *
     * @param elemento
     * @return boolean Retorna True si se elimino el elemento, False en caso
     *         contrario
     */
    public boolean bajaElemento(T elemento) {
        return contenedor.remove(elemento);
    }

    /**
     * Quita un elemento del ArrayList por el indice
     *
     * @param index
     * @return boolean Retorna True si se elimino el elemento, False en caso
     *         contrario
     */
    public T bajaElemento(int index) {
        return contenedor.remove(index);
    }

    /**
     * Retorna la cantidad de elementos en el ArrayList
     *
     * @return int cantidad de elementos
     */
    public int cantidadElementos() {
        return contenedor.size();
    }

    /**
     * Lista los elementos en forma de String
     *
     * @return String Texto de elentos del ArrayList
     */
    public String listarElementos() {
        StringBuilder builder = new StringBuilder();

        for (T elemento : contenedor) {
            builder.append(elemento.toString());
        }

        return builder.toString();
    }

    /**
     * Busca un elemento en el contenedor
     *
     * @param index del elemento a buscar
     * @return el elemento buscado
     */

    public T buscarElemento(int index) {
        return contenedor.get(index);
    }

    /**
     * Comprueba si un elemento existe en el contenedor
     *
     * @param elemento buscado
     * @return true si existe, false en caso contrario
     */


    public boolean existeElemento(T elemento) {
        return contenedor.contains(elemento);
    }

}
