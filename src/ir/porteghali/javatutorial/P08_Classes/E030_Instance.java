package ir.porteghali.javatutorial.P08_Classes;

public class E030_Instance {

    public void Start() {
        System.out.println("E030_Instance");

        E030_Instance_Example example = new E030_Instance_Example();
        example.print();
        example.Hi("Ebrahim");
    }
}
