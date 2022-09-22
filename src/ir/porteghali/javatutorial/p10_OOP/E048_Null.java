package ir.porteghali.javatutorial.p10_OOP;

import ir.porteghali.javatutorial.p08_Classes.E033_Cat;

public class E048_Null {
    //NullPointerException

    public E048_Null() {
        E033_Cat cat = new E033_Cat();
        whereIsMyCat(null);
    }

    private void whereIsMyCat(E033_Cat cat) {
        cat.Sound();
    }
}
