package com.FirstJavaProject.Operators;

import com.FirstJavaProject.Lib;

public class Add {
    /* EXECUTE */
    public static void exec() {
        System.out.println("|| Addition                        (V1.1 - 04/20) ||");

        // Define numbers
        double nbr1 = Lib.readDouble("Nombre 1:");
        double nbr2 = Lib.readDouble("Nombre 2:");

        // Result
        System.out.printf("Resultat : %f", nbr1 + nbr2);
    }
}
