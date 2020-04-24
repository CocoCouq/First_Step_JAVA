package com.FirstJavaProject.Loops;

import com.FirstJavaProject.Lib;

public class IntervalSum {
    // Define Result
    public static long interSum(long nbr1, long nbr2) {
        long result = 0;

        if (nbr1 < nbr2) {
            while (nbr1 <= nbr2)
                result += nbr1++;
        }
        else {
            while (nbr2 <= nbr1)
                result += nbr2++;
        }

        return result;
    }

    /* EXECUTE */
    public static void exec() {
        System.out.println("|| Somme Intervalle                  (V1.1 - 04/20) ||");

        // Numbers
        long nbr1 = Lib.readLong("Nombre 1:");
        long nbr2 = Lib.readLong("Nombre 2:");

        // Result
        System.out.printf("Résultat : %d", interSum(nbr1, nbr2));
    }
}
