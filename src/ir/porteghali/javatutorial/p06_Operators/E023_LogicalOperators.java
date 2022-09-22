package ir.porteghali.javatutorial.p06_Operators;

public class E023_LogicalOperators {

    public void Start() {

        /*
            &&  and
            ||  or
            !   not     (! use for opposite)
         */

        int a = 25;
        int b = 12;
        int c = 10;
        boolean d = true;

        System.out.println(
                a>b
                &&
                c>b
        );

        System.out.println(
                a>b
                ||
                c>b
        );

        System.out.println(
                !(a>b)
                ||
                c>b
        );

        System.out.println(
                a>b
                &&
                c>b
                ||
                d
        );
    }
}
