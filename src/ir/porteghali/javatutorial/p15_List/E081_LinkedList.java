package ir.porteghali.javatutorial.p15_List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class E081_LinkedList {

    public E081_LinkedList() {
        List<String> list = new ArrayList<>();
        list.add("Iran");
        list.add("Saudi");
        list.add("UAE");
        list.add("Qatar");

        for (String country : list)
            System.out.println(country);

        System.out.println("=======");

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Iran");
        linkedList.add("Saudi");
        linkedList.add("UAE");
        linkedList.add("Qatar");

        linkedList.pop();

        for (String country : linkedList)
            System.out.println(country);
    }
}
