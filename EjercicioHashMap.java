
import java.util.HashMap;

public class EjercicioHashMap {
    public static void main(String[] args) {
    
    HashMap<Integer, Integer> listaNum = new HashMap<>();

    listaNum.put(1, 1);
    listaNum.put(2, 4);

    System.out.println("imprimiendo los valores del HashMap:");
    System.out.println(listaNum.get(1));
    System.out.println(listaNum.get(2));
    System.out.println("---------------------");
    System.out.println(listaNum);
    
    System.out.println(listaNum.size()); // Imprimiendo el tamaño del HashMap

    for (Integer i : listaNum.keySet()) { // Recorriendo las claves del HashMap
        System.out.println("Clave: " + i + ", Valor: " + listaNum.get(i));
        }

    for (Integer valor : listaNum.values()){// Recorriendo los valores del HashMap
        System.out.println("Valor: " + valor );// Imprimiendo la clave asociada al valor
    }


    }


}
