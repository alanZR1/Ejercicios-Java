
import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
    
    LinkedList <String> namesLinkedList = new LinkedList<>();
    namesLinkedList.add("Alan");
    namesLinkedList.add("hola");
    namesLinkedList.add("Mundo");
    namesLinkedList.add("Bla");

    System.out.println(namesLinkedList);

    
    ArrayList<String> namesArrayList = new ArrayList<>();
    namesArrayList.add("Alan");
    namesArrayList.add("hola");
    namesArrayList.add("Mundo");
    namesArrayList.add("Bla");

    System.out.println(namesArrayList);

    }
}