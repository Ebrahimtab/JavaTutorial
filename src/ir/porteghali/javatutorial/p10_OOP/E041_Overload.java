package ir.porteghali.javatutorial.p10_OOP;

public class E041_Overload {

    public E041_Overload() {

    }

    public void Hello() {
        System.out.println("Hello!");
    }

    public void Hello(String name) {
        System.out.println("My name is " + name);
    }

    public void Hello(int age) {
        System.out.println("I'm " + age + " years old");
    }

    public void Hello(String country, String city) {
        System.out.println("I'm from " + country + ", " + city);
    }

    public void Hello(float height) {
        System.out.println("My height is " + height + " m");
    }
}
