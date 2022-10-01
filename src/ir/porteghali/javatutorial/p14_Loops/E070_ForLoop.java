package ir.porteghali.javatutorial.p14_Loops;

import java.util.Arrays;

public class E070_ForLoop {

    public E070_ForLoop() {
        Integer [] myArray = {100, 5, 27, 51, 1, 16};
        Arrays.sort(myArray);

        System.out.println("0: " + myArray[0]);
        System.out.println("1: " + myArray[1]);
        System.out.println("2: " + myArray[2]);
        System.out.println("3: " + myArray[3]);
        System.out.println("4: " + myArray[4]);
        System.out.println("5: " + myArray[5]);

        System.out.println("======");

        Integer [] yourArray = {100, 5, 27, 51, 1, 16};
        Arrays.sort(yourArray);

        for (int i = 0; i < yourArray.length; i++) {
            System.out.println(i + ": " + myArray[i]);
        }
    }
}
