package ir.porteghali.javatutorial.p18_TicTacToe;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TicTacToe {

    HashMap<Integer, String> table = new HashMap<>();
    String turn = "X";
    String player1 = "";
    String player2 = "";
    String playAgain;
    Scanner scanner = new Scanner(System.in);
    Boolean gameOver = false;

    public TicTacToe() {
        initTable();
        play();
    }

    private void play() {
        if (player1.equals("") || player2.equals("")) {
            System.out.println("Please enter player1 name:");
            player1 = scanner.nextLine();
            System.out.println("Please enter player2 name:");
            player2 = scanner.nextLine();
        }

        while (!gameOver) {
            drawTable();
            System.out.println("Turn: " + ((turn.equals("X")) ? player1 : player2));
            System.out.println("Choose a cell");
            try {
                int cell = Integer.parseInt(scanner.nextLine());
                processInput(cell);
            }
            catch (NumberFormatException e) {
                System.out.println("Wrong input");
            }
        }

        System.out.println("Do you want to play again? (y/n)");
        playAgain = scanner.nextLine();

        if (playAgain.equals("y")) {
            turn = "X";
            gameOver = false;
            clearOutput();
            initTable();
            play();
        }
    }

    private void initTable() {
        table.put(1, "1");
        table.put(2, "2");
        table.put(3, "3");
        table.put(4, "4");
        table.put(5, "5");
        table.put(6, "6");
        table.put(7, "7");
        table.put(8, "8");
        table.put(9, "9");
    }

    private void drawTable() {
        System.out.println(" ");
        for (Map.Entry<Integer, String> entry : table.entrySet()) {
            System.out.print("\t" + entry.getValue() + "\t");

            if (entry.getKey()%3==0)
                System.out.println("\n");
        }
    }

    private void clearOutput() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

    private void processInput(int cell) {
        if (cell<1 || cell>9) {
            System.out.println("Wrong input");
            return;
        } else {
            try {
                Integer.parseInt(table.get(cell));
            }
            catch (NumberFormatException e) {
                System.out.println("Cell is already used");
                return;
            }
        }

        table.put(cell, turn);
        turn = turn.equals("X") ? "O" : "X";
        clearOutput();
        processTable();
    }

    private void processTable() {
        String winner = "";

        int counter = 0;
        for (Map.Entry<Integer, String> entry : table.entrySet()) {
            try {
                Integer.parseInt(entry.getValue());
            }
            catch (NumberFormatException e) {
                counter++;
            }
        }

        if (table.get(1).equals(table.get(2)) && table.get(1).equals(table.get(3)))
            winner = table.get(1);
        else if (table.get(4).equals(table.get(5)) && table.get(4).equals(table.get(6)))
            winner = table.get(4);
        else if (table.get(7).equals(table.get(8)) && table.get(7).equals(table.get(9)))
            winner = table.get(7);
        else if (table.get(1).equals(table.get(4)) && table.get(1).equals(table.get(7)))
            winner = table.get(1);
        else if (table.get(2).equals(table.get(5)) && table.get(2).equals(table.get(8)))
            winner = table.get(2);
        else if (table.get(3).equals(table.get(6)) && table.get(3).equals(table.get(9)))
            winner = table.get(3);
        else if (table.get(1).equals(table.get(5)) && table.get(1).equals(table.get(9)))
            winner = table.get(1);
        else if (table.get(3).equals(table.get(5)) && table.get(3).equals(table.get(7)))
            winner = table.get(3);

        if (winner.equals("")) {
            if (counter == 9) {
                gameOver = true;
                drawTable();
                System.out.println("Draw!");
            }
            return;
        }

        gameOver = true;
        drawTable();
        System.out.println((winner.equals("X") ? player1:player2) + " win!");
    }
}
