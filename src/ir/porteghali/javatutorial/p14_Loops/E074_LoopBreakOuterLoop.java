package ir.porteghali.javatutorial.p14_Loops;

public class E074_LoopBreakOuterLoop {

    public E074_LoopBreakOuterLoop() {

        outerLoop: for (int i=0; i<5; i++) {
            for (int j=0; j<3; j++) {
                System.out.println(i + " : " + j);
                if (j == 1) continue outerLoop;
                if (i == 3) break outerLoop;
            }
        }
    }
}
