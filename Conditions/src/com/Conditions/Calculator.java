package com.Conditions;

import java.util.Scanner;

public class Calculator {
    final static Scanner READ = new Scanner(System.in);

    // Numbers
    public static double defineNumber(String message) {
        System.out.println(message);
        double number = READ.nextDouble();
        return number;
    }

    // Operator
    public static char operator() {
        System.out.println("Opérateur :");
        String opp = READ.next();
        // For accept white-space, just take first char of string
        return opp.charAt(0);
    }

    // Operation
    public static double calculi(double nbr1, double nbr2, char operator) {

        double result = 0;

        switch (operator) {
            case 43:
                result = nbr1 + nbr2;
                break;
            case 42:
                result = nbr1 * nbr2;
                break;
            case 45:
                result = nbr1 - nbr2;
                break;
            case 47:
                if (nbr2 != 0)
                    result = nbr1 / nbr2;
                break;
        }

        return result;
    }

    // MAIN
    public static void main(String[] args) {
        System.out.println("**** Calculette (V1.0 - 04/20) ****");
        // Variables
        double result = 0;

        // Number 1
        double nbr1 = defineNumber("Nombre 1:");

        // Operator
        char operator = operator();

        // Number 2
        double nbr2 = defineNumber("Nombre 2:");

        // Calculator
        if (nbr2 != 0) {
            result = calculi(nbr1, nbr2, operator);
            System.out.println(result);
        }
        else {
            System.out.println("Pas de division par 0");
        }
    }
}
