package com.Operateurs;

import java.util.Scanner;

public class Add
{
    final static Scanner READ = new Scanner(System.in);

    // Read number in console with message
    public static double readNumber(String message) {
        System.out.println(message);
        double number = READ.nextDouble();
        return number;
    }

    // MAIN
    public static void main(String[] args) {
        System.out.println("**** Additionneur (V1.0 - 04/20) ****");

        double nbr1 = readNumber("Nombre 1:");
        double nbr2 = readNumber("Nombre 2:");

        // Result
        System.out.println("Resultat:");
        System.out.println(nbr1+nbr2);
    }
}