package ir.porteghali.javatutorial.p14_Loops;

public class E075_WhileLoop {

    public E075_WhileLoop() {
        Boolean condition = false;
        int counter = 1;

        while (!condition) {
            System.out.println("while is running: " + counter);
            counter++;

            condition = counter > 10;
        }
    }
}
