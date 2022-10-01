package ir.porteghali.javatutorial.p12_ConditionalStatements;

import ir.porteghali.javatutorial.p10_OOP.E053_Colors;

public class E065_SwitchDefault {

    public E065_SwitchDefault() {
        E053_Colors colors = E053_Colors.WHITE;

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
            default:
                System.out.println("Not found");
        }
    }
}
