package ir.porteghali.javatutorial.p13_Arrays;

public class E066_Arrays {

    public E066_Arrays() {
        int a = 10;
        int b = 15;
        int c = 18;
        int d = 20;

        float average = (a + b + c + d) / 4;
        System.out.println(average);

        int [] array = new int[4];
        array[0] = 5;
        array[2] = 9;
        array[3] = 4;

        System.out.println(array[0]);
        System.out.println(array[1]);

        /*
           0     1     2     3
        -------------------------
        |  5  |     |  9  |  4  |
        -------------------------
         */

        String [] name = new String[5];
        name[0] = "Ahmad";
        name[1] = "Moslem";
        name[2] = "Hozeyfa";
        name[3] = "Ebrahim";

        System.out.println(name[3]);
        System.out.println(name[4]);

        /*
             0          1         2         3         4
        ----------------------------------------------------
        |  Ahmad  |  Moslem  | Hozeyfa | Ebrahim |         |
        ----------------------------------------------------
         */
    }
}
