package ir.porteghali.javatutorial.p07_Methods;

public class E028_MethodsParameters {

    public void Start() {
        int x = 2;
        int y = 10;
        int z = 3;
        int c = sum(x,y);
        int d = sum(x,z,"ali");

        System.out.println(c);
        System.out.println(d);
        System.out.println(minus(10, 8));
        System.out.println(multiple(4,6));
        System.out.println(div(25,7));
    }

    public int sum(int a, int b) {
        return a+b;
    }

    public int sum(int a, int b, String d) {
        return a+b;
    }

    public int minus(int a, int b) {
        return a-b;
    }

    public int multiple(int a, int b) {
        return a*b;
    }

    public int div(int a, int b) {
        return a/b;
    }
}
