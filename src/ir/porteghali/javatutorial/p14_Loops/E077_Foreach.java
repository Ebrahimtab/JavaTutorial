package ir.porteghali.javatutorial.p14_Loops;

public class E077_Foreach {

    public E077_Foreach() {
        int [] array = {2, 4, 6, 8, 12};

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("---");

        for (int item : array) {
            System.out.println(item);
        }
    }
}
