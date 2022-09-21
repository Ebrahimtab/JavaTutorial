package ir.porteghali.javatutorial.P08_Classes;

import javax.sound.midi.Soundbank;
import java.net.SocketTimeoutException;

public class E034_InnerClasses {

    public E034_InnerClasses() {
        System.out.println("E034_InnerClasses");

        InnerClass.InnerClassLevel2.print("Hello");

        NonStaticInnerClass nsic = new NonStaticInnerClass();
        nsic.print("Hello");
    }

    public static class InnerClass {

        public static class InnerClassLevel2 {

            public static void print(String message) {
                System.out.println("InnerClass -> InnerClassLevel2 -> " + message);
            }
        }
    }

    public class NonStaticInnerClass {

        public void print(String message) {
            System.out.println("NonStaticInnerClass -> " + message);
        }

    }
}
