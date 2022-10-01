package ir.porteghali.javatutorial.p13_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class E069_ArraySort {

    public E069_ArraySort() {
        int [] myArray = {100, 5, 27, 51, 1, 16};
        Integer [] myArray2 = {100, 5, 27, 51, 1, 16};

        printArray(myArray);
        System.out.println("------");
        Arrays.sort(myArray);
        printArray(myArray);

        System.out.println("------");

        Arrays.sort(myArray2, Collections.reverseOrder());
        printArray2(myArray2);
    }

    private void printArray(int [] array) {

        System.out.println("0: " + array[0]);
        System.out.println("1: " + array[1]);
        System.out.println("2: " + array[2]);
        System.out.println("3: " + array[3]);
        System.out.println("4: " + array[4]);
        System.out.println("5: " + array[5]);
    }

    private void printArray2(Integer [] array) {

        System.out.println("0: " + array[0]);
        System.out.println("1: " + array[1]);
        System.out.println("2: " + array[2]);
        System.out.println("3: " + array[3]);
        System.out.println("4: " + array[4]);
        System.out.println("5: " + array[5]);
    }
}
