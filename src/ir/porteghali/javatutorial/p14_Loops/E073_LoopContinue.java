package ir.porteghali.javatutorial.p14_Loops;

public class E073_LoopContinue {

    public E073_LoopContinue() {

        for (int i=1; i<=5; i++) {
            System.out.println("a");
            if (i>2 && i<5) continue;
            System.out.println(i);
        }
    }
}
