
import java.util.HashMap;
import java.util.Map;

public class Colecciones {

    public static void main(String[] args) {
        


    
        System.out.println("Todo funcionando correctamente");
        Integer[] edades = new Integer[4];
        edades[0] = 23;
        edades[1] = 18;
        edades[2] = 14;
        edades[3] = 19;


        for (int i = 0; i < edades.length; i++) {
            System.err.println("edades:" + edades[i]);
            

        }


        HashMap<String, Integer> animal_peso = new HashMap<>();
        animal_peso.put("Perro", 21);
        animal_peso.put("Gato", 10);
        animal_peso.put("LACOBRA", 123);

        for (Map.Entry<String, Integer> animal : animal_peso.entrySet()) {
            System.err.println("El animal es: " + animal.getKey() + " y pesa: " + animal.getValue() + "kg");
            
        }
    }
    
}
