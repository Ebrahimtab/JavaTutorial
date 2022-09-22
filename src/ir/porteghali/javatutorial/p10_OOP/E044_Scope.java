package ir.porteghali.javatutorial.p10_OOP;

public class E044_Scope {
    int a = 0;
    int b = 2;
    String name = "Ebrahim";

    public E044_Scope() {
        a = b;
        int c = 10;
    }

    public void LocalScope() {
        a = b;
        int c = b;
        int a = this.a;
    }

    public void anotherLocalScope() {
        a = a + b;
        System.out.println(name);
    }
}
