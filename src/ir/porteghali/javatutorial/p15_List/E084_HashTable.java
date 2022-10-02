package ir.porteghali.javatutorial.p15_List;

import java.util.Hashtable;
import java.util.Map;

public class E084_HashTable {

    public E084_HashTable() {

        //Hashtable cannot be null
        Hashtable<String, String> hashtable = new Hashtable<>();
        hashtable.put("fruit", "mango");
        hashtable.put("animal", "lion");

        for (Map.Entry entry : hashtable.entrySet())
            System.out.println(entry.getKey() + ": " + entry.getValue());

        System.out.println("============");

        hashtable.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
