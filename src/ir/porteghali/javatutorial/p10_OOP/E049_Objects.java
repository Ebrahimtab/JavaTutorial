package ir.porteghali.javatutorial.p10_OOP;

import ir.porteghali.javatutorial.p08_Classes.E033_Animal;
import ir.porteghali.javatutorial.p08_Classes.E033_Dog;

public class E049_Objects {

    public E049_Objects() {
        E033_Animal animal = new E033_Animal();
        E033_Dog dog = new E033_Dog();
        animal = dog;
        Object object = animal;
    }
}
