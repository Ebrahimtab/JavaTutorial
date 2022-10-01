package ir.porteghali.javatutorial.p14_Loops;

public class E072_LoopBreak {

    public E072_LoopBreak() {

        for (int i=1; i<=20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }

            if (i == 15) break;
        }
    }
}
