package ir.porteghali.javatutorial.P06_Operators;

import javax.sound.midi.Soundbank;

public class E021_ArithmeticOperators {

    public void Start() {
        /*
            +   addition
            -   subtraction
            *   multiplication
            /   division
            %   modulus
            ++  increment
            --  decrement
         */

        int a = 9;
        int b = 5;
        int c = 14;
        int d = 4;

        System.out.println(a/d);

        System.out.println(++a);
        System.out.println(a);

        System.out.println(b++);
        System.out.println(b);

        int e = c % d;
        System.out.println(e);
    }
}
