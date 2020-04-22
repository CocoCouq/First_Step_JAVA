package com.Boucles;

import java.util.Scanner;

public class IntervalSum {
    final static Scanner READ = new Scanner(System.in);

    // Define numbers
    public static long defineLong(String message) {
        System.out.println(message);
        long nbr = READ.nextLong();
        return nbr;
    }

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

    // MAIN
    public static void main(String[] args) {
        System.out.println("**** Sommes d'un interval (V1.0 - 04/20) ****");

        // Numbers
        long nbr1 = defineLong("Nombre 1:");
        long nbr2 = defineLong("Nombre 2:");

        // Result
        long result = interSum(nbr1, nbr2);
        System.out.println(result);
    }
}
