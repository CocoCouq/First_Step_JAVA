package com.Operateurs;

import java.util.Scanner;

public class Div
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
        System.out.println("**** Diviseur (V1.0 - 04/20) ****");

        double nbr1 = readNumber("Nombre 1:");
        double nbr2 = readNumber("Divisé par:");

        // Verify if divider is not null
        boolean verif = (nbr2 != 0) ? true : false;

        if (verif) {
            System.out.println("Resultat:");
            System.out.println(nbr1 / nbr2);
        }
        else {
            System.out.println("!! Pas de division par 0 !!");
        }
    }
}