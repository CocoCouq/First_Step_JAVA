package com.Boucles;

import java.util.Scanner;

public class Average {
    public static Scanner READ = new Scanner(System.in);

    // Define numbers
    public static double defineNum(String message) {
        System.out.println(message);
        double number = READ.nextDouble();
        return number;
    }

    // MAIN
    public static void main(String[] args) {
        System.out.println("**** Moyenne (V1.0 - 04/20) ****");

        double sum = 0;
        int i = 0;

        System.out.println("TERMINEZ LA SAISIE PAR 0");
        // First number
        double number = defineNum("Saisissez le nombre :");

        // Sum
        while(number != 0){
            sum += number;
            number = defineNum("Nombre suivant :");
            i++;
        }

        // Result
        System.out.print("Moyenne :");
        System.out.println(sum / i);
    }
}
