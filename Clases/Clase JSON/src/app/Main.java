package app;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Main {

    public static void main(String[] args) {
        JSONObject miPrimerJson = new JSONObject();
        JSONObject miPrimerJson2 = new JSONObject();
        JSONObject miPrimerJson3 = new JSONObject();

        try {
            miPrimerJson.put("agus", 3); //poliformismo tecnico (Json object es una clase, tiene sobrecargado el meotod put) dentro de la clase
            miPrimerJson.put("liam", false);
            miPrimerJson.put("imagen", "linda");
            miPrimerJson.put("sel",29);

            miPrimerJson2.put("pelicula", 10); //poliformismo tecnico (Json object es una clase, tiene sobrecargado el meotod put) dentro de la clase
            miPrimerJson2.put("nota", 1);
            miPrimerJson2.put("falopa", "budin");
            miPrimerJson2.put("sel",247);

            miPrimerJson3.put("agustin", "feo"); //poliformismo tecnico (Json object es una clase, tiene sobrecargado el meotod put) dentro de la clase
            miPrimerJson3.put("liam", "chiquito");
            miPrimerJson3.put("imagen", "linda");
            miPrimerJson3.put("sel",56);

            System.out.println(miPrimerJson.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        //es una excepcion comprobada (se espera que pase), obliga a hacer el try-catch

        JSONArray arJson =  new JSONArray();
        arJson.put(miPrimerJson);
        arJson.put(miPrimerJson2);
        arJson.put(miPrimerJson3);

        System.out.println(arJson.toString());

    }
}
