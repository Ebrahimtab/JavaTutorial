package ir.porteghali.javatutorial.p15_List;

import java.util.ArrayList;
import java.util.List;

public class E079_ListWithLoop {

    public E079_ListWithLoop() {
        List<String> name = new ArrayList<>();
        name.add("Ahmad");
        name.add("Moslem");
        name.add("Hozeyfa");
        name.add("Ebrahim");

        System.out.println(name);

        for (String item : name) {
            System.out.println(item);
        }
    }
}
