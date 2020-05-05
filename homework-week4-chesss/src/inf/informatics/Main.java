package inf.informatics;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean hasWinner = false;


        String currentPlayer = "w";

        String winner = "";


        String[][] pieces = {{"wDw", "wD", "wQ", "wK", "wM", "wDw"}, {"x", "x", "x", "x", "x", "x"}, {"x", "x", "x", "x", "x", "x"}, {"x", "x", "x", "x", "x", "x"},
                {"x", "x", "x", "x", "x", "x"}, {"bDw", "bMw", "bK", "bQ", "bD", "bDw"}};

        printBoard(pieces);

        while (!hasWinner) {
            System.out.println("Въведи текущ ред и колона:");
            String[] currentPosition = scanner.nextLine().split("");

            //AB
            int currentRow = parseChar(currentPosition[0]);
            int currentCol = parseChar(currentPosition[1]);

            System.out.println("Въведи желана позиция за ред и колона:");
            String[] desiredPosition = scanner.nextLine().split("");

            //AB
            int desiredRow = parseChar(desiredPosition[0]);
            int desiredCol = parseChar(desiredPosition[1]);


            String currentFigure = pieces[currentRow][currentCol];

            String desiredFigure = pieces[desiredRow][desiredCol];

            if (desiredFigure.charAt(0) == currentPlayer.charAt(0)) {
                System.out.println("Позицията е заета от ваша фигура.");
                continue;
            }

            if (desiredFigure.contains("K")) {
                hasWinner = true;
                winner = currentPlayer;
            } else {
                pieces[desiredRow][desiredCol] = currentFigure;
                pieces[currentRow][currentCol] = "x";


                currentPlayer = currentPlayer.equals("w") ? "b" : "w";
            }


            printBoard(pieces);

        }

        System.out.println("The winner is: " + winner);


    }

    public static void printBoard(String[][] arr) {
        for (String[] strings : arr) {
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println();
        }
    }


    public static int parseChar(String character) {
        int number = -1;

        switch (character) {
            case "A":
                number = 0;
                break;

            case "B":
                number = 1;
                break;

            case "C":
                number = 2;
                break;
            case "D":
                number = 3;
                break;
            case "E":
                number = 4;
                break;
            case "F":
                number = 5;
                break;
        }
        return number;

    }

}