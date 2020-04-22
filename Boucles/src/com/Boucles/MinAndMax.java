package com.Boucles;

import java.util.Scanner;

public class MinAndMax {
    public static Scanner READ = new Scanner(System.in);

    // Define numbers
    public static double defineNum(String message) {
        System.out.println(message);
        double number = READ.nextDouble();
        return number;
    }

    // Display result
    public static void displayResult(double result, String message) {
        System.out.print(message);
        System.out.println(result);
    }

    // MAIN
    public static void main(String[] args) {
        System.out.println("**** Min et Max (V1.0 - 04/20) ****");

        double sum = 0;
        int i = 0;

        System.out.println("TERMINEZ LA SAISIE PAR 0");
        // First number
        double number = defineNum("Saisissez le nombre :");
        double max = number;
        double min = max;

        // Sum, min and max
        while(number != 0){
            sum += number;
            min = Math.min(min, number);
            max = Math.max(max, number);
            number = defineNum("Nombre suivant :");
            i++;
        }

        // Result
        displayResult(sum/i, "Moyenne :");
        displayResult(min, "Min :");
        displayResult(max, "max :");
    }
}
