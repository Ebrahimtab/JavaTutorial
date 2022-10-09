package ir.porteghali.javatutorial.p16_Java8;

public interface E087_Dog {

    default void Sound() {
        System.out.println("Waq Waq");
    }

    static void Walk() {
        System.out.println("Dog is walking");
    }
}
