package ir.porteghali.javatutorial.p05_Variables;

public class E019_CastingVariables {

    public void Start() {
        int apple;
        int peach = 10;
        double mango;
        double orange = 5.84;
        String carrot = "19.25";
        String banana = "16";

        apple = (int)orange;
        peach = Integer.parseInt(banana);
        orange = Double.parseDouble(carrot);
        mango = Float.parseFloat(banana);

        System.out.println(apple);
        System.out.println(peach);
        System.out.println(orange);
        System.out.println(mango);
    }
}
