package com.Boucles;

import javax.sound.midi.SoundbankResource;
import java.net.PortUnreachableException;
import java.util.Scanner;

public class IsPrime {
    final static Scanner READ = new Scanner(System.in);

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

    public static void main(String[] args) {
        System.out.println("**** Nombres Premiers (V1.0 - 04/20) ****");

        // Number
        System.out.println("Nombre a tester :");
        long nbr = READ.nextLong();

        // Test
        boolean prime = isPrime(nbr);

        // Result
        if (prime)
            System.out.println("Premier");
        else
            System.out.println("Non premier");
    }
}
