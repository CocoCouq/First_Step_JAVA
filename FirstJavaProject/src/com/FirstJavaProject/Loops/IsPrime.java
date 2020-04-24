package com.FirstJavaProject.Loops;

import com.FirstJavaProject.Lib;

public class IsPrime {
    // Define if is prime or not
    public static boolean isPrime(long nbr) {
        long i = 3;

        if (nbr <= 1)
            return false;
        else if (nbr == 2)
            return true;
        else if (nbr % 2 == 0)
            return false;
        else {
            // Can use Math.sqrt
            while (i * i <= nbr) {
                if (nbr % i == 0)
                    return false;
                i += 2; // Just test uneven
            }
            return true;
        }
    }

    /* EXECUTE */
    public static void exec() {
        System.out.println("|| Is Prime                        (V1.1 - 04/20) ||");

        // Number
        long nbr = Lib.readLong("Nombre a tester :");

        // Test
        boolean prime = isPrime(nbr);

        // Result
        if (prime)
            System.out.println("Premier");
        else
            System.out.println("Non premier");
    }
}