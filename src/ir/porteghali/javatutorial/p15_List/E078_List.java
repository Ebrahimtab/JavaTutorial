package ir.porteghali.javatutorial.p15_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class E078_List {

    public E078_List() {
        Integer [] array = {98, 99, 100};

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(null);
        list.add(10);
        list.add(4, 12);
        list.addAll(Arrays.asList(array));

        System.out.println(list.size());

        System.out.println("----");

        System.out.println(list.get(0));
        System.out.println(list.get(4));
        System.out.println(list.get(5));
        System.out.println(list.get(8));

        System.out.println("----");

        Integer [] myArray = {7, 8, 9};
        List<Integer> myList = new ArrayList<>(Arrays.asList(myArray));

        myList.set(2, 99);

        System.out.println(myList.get(1));
        System.out.println(myList.get(2));
        System.out.println(myList.contains(7));
        System.out.println(myList.indexOf(99));
    }
}
