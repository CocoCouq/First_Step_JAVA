package com.FirstJavaProject.Loops;

import com.FirstJavaProject.Lib;

public class SumInferior {
    /* EXECUTE */
    public static void exec() {
        System.out.println("|| Somme des entiers inférieurs           (V1.1 - 04/20) ||");

        long result = 0;
        long number = Lib.readLong("Renseignez le nombre :");

        // Result
        while (--number > 0)
            result += number;

        System.out.printf("Resultat : %d", result);
    }
}