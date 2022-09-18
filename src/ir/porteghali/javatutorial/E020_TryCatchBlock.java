package ir.porteghali.javatutorial;

public class E020_TryCatchBlock {

    public void Start() {

        String power = "9.5";

        try {
            int a =Integer.parseInt(power);

            System.out.println(a);
        }
        catch (NumberFormatException z){
            System.out.println(z.getMessage());
        }
        finally {
            System.out.println("power");
        }


        try {
            float b = Float.parseFloat(power);

            System.out.println(b);
        }
        catch (NumberFormatException x){
            System.out.println(x.getMessage());
        }
        finally {
            System.out.println("power");
        }
    }
}
