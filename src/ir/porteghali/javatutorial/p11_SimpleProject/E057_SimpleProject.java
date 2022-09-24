package ir.porteghali.javatutorial.p11_SimpleProject;

import java.util.Scanner;

public class E057_SimpleProject {
    
    int a;
    int b;
    String operator;
    Scanner scanner;
    public E057_SimpleProject() {
        System.out.println("Welcome to my great calculator!!!");
        this.scanner = new Scanner(System.in);
        start();
    }
    
    private void start() {
        System.out.println("Please enter the first number");
        a = Integer.parseInt(scanner.nextLine());
        
        System.out.println("please enter the operator");
        operator = scanner.nextLine();

        System.out.println("Please enter the second number");
        b = Integer.parseInt(scanner.nextLine());
        
        E057_Calculator calculator = new E057_Calculator();
        int respose;
        int operatorError = 0;
        switch (operator) {
            case "+" : {
                respose = calculator.sum(a,b);
                break;
            }
            case "-" : {
                respose = calculator.minus(a,b);
                break;
            }
            case "*" : {
                respose = calculator.mult(a,b);
                break;
            }
            case "/" : {
                respose = calculator.div(a,b);
                break;
            }
            default:
                respose = 0;
                operatorError = 1;
        }

        if (operatorError == 0) {
            System.out.println("The answer:");
            System.out.println(respose);
        }
        else {
            System.out.println("operator is undefined");
        }
    }
}
