package ir.porteghali.javatutorial.p12_ConditionalStatements;

public class E060_If_Else_If_Else {

    public E060_If_Else_If_Else() {

        int a = 10;
        int b = 20;
        int c = 12;

        if (!(a < b) && c > 10) {
            System.out.println(1);
        } else if (b < 15) {
            System.out.println(2);
        } else if (c != 12) {
            System.out.println(3);
        } else {
            System.out.println(4);
        }
    }
}
