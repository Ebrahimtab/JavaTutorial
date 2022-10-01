package ir.porteghali.javatutorial.p12_ConditionalStatements;

import ir.porteghali.javatutorial.p10_OOP.E053_Colors;

public class E064_SwitchBreak {

    public E064_SwitchBreak() {
        E053_Colors colors = E053_Colors.GREEN;

        switch (colors) {
            case RED:
                System.out.println("RED");
                break;
            case GREEN:
                System.out.println("GREEN");
                break;
            case BLUE:
                System.out.println("BLUE");
                break;
            case BLACK:
                System.out.println("BLACK");
                break;
            case WHITE:
                System.out.println("WHITE");
                break;
        }
    }
}
