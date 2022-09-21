package ir.porteghali.javatutorial.P08_Classes;

public class E031_StaticUsage {

    public void Start() {
        E030_Instance_Example object = new E030_Instance_Example();
        object.print();

        String name = E030_Instance_Example.MyName();
        System.out.println(name);

        String end = E030_Instance_Example.bye;
        System.out.println(end);
    }
}
