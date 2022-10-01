package ir.porteghali.javatutorial.p12_ConditionalStatements;

public class E062_If_Else_WithoutBlock {

    public E062_If_Else_WithoutBlock() {

        int a = 10;
        int b = 20;
        int c = 12;

        //If you have one line order in the block of if or else you can write the order without block
        if (!(a < b) && c > 10) System.out.println("inside if");
        else System.out.println("inside else");
    }
}
