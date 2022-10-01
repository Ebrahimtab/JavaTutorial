package ir.porteghali.javatutorial.p12_ConditionalStatements;

public class E061_TernaryOperator {

    public E061_TernaryOperator() {

        int a = 10;
        int b = 20;
        int c;

        if (a > 10) {
            c = a;
        } else {
            c = b;
        }
        System.out.println(c);

        int d = a>10 ? a : b;
        System.out.println(d);
    }
}
