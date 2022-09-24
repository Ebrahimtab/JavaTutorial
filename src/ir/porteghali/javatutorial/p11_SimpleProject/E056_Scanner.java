package ir.porteghali.javatutorial.p11_SimpleProject;

import java.util.Scanner;

public class E056_Scanner {

    public E056_Scanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = scanner.nextLine();
        System.out.println("Welcome " + name + ", enter your age please");

        int age = 0;
        try {
            age = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println(e.toString());
        }

        System.out.println("You are " + age + " years old");
    }
}
