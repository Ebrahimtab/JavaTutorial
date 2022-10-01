package ir.porteghali.javatutorial.p12_ConditionalStatements;

public class E063_Switch {

    public E063_Switch() {
        int a = 4;

        switch (a) {
            case 1:
                System.out.println(1);
            case 2:
                System.out.println("a");
            case 3:
            case 4:
            case 5:
                System.out.println("3-4-5");
            case 10:
                System.out.println("Hello");
        }
    }
}
