package com.Boucles;

import java.util.Scanner;

public class Multiples {
    final static Scanner READ = new Scanner(System.in);

    // Define integers
    public static int defineInt(String message) {
        System.out.println(message);
        int number = READ.nextInt();
        return number;
    }

    // Display number line
    public static void diplayMultLine(int number, int multiple) {
        int result = number * multiple;
        System.out.printf("%d X %d = %d%n", number, multiple, result);
    }

    // Multiplication and display result
    public static void displayMultiples(int number, int multiple) {
        while (number > 0)
            diplayMultLine(number--, multiple);
    }

    // MAIN
    public static void main(String[] args) {
        System.out.println("**** N multiples de X (V1.0 - 04/20) ****");

        // Numbers
        int number = defineInt("Quel nombre voulez-vous multiplier ?");
        int multiple = defineInt("Combien de fois ?");

        // Return table
        displayMultiples(number, multiple);
    }
}
