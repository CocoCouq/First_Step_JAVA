package com.FirstJavaProject.Conditions;

import com.FirstJavaProject.Lib;

public class Calculator {
    // Operation
    public static double calc(double nbr1, double nbr2, char operator) {

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
            default:
                System.out.println("L'opérateur n'est pas connu");
        }
        return result;
    }

    /* EXECUTE */
    public static void exec() {
        System.out.println("|| Calculette                       (V1.1 - 04/20) ||");

        double result = 0;

        // Number 1
        double nbr1 = Lib.readDouble("Nombre 1:");

        // Operator
        char operator = Lib.readChar("Opération :");

        // Number 2
        double nbr2 = Lib.readDouble("Nombre 2:");

        // Calculator
        System.out.printf("Resultat : %f", calc(nbr1, nbr2, operator));
    }
}
