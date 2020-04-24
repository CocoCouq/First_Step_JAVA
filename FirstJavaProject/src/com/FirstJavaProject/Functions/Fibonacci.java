package com.FirstJavaProject.Functions;

import com.FirstJavaProject.Lib;

public class Fibonacci {
    // Recursive Fibonacci to an index
    public static long fibonacci(int index) {
        // n < 2 because fibonacci(0) = fibonacci(1) = 1. It is the shutdown condition
        if (index < 2)
            return index;
        else
            // While we haven't shutdown condition, we stock results
            return fibonacci(index-2) + fibonacci(index - 1);
    }

    // n firsts numbers
    public static void nFibonacci(int n) {
        while (n >= 0)
            System.out.printf("%d: %d %n", n, fibonacci(n--));
    }

    /* EXECUTE */
    public static void exec() {
        System.out.println("|| Fibonacci                          (V1.1 - 04/20) ||");

        int exo = Lib.readInt("1: Valeur a un index  --  2: N premières valeurs");

        // Choice exercice
        switch (exo) {
            case 1 :
                int index = Lib.readInt("Quel index :");
                System.out.printf("Resultat: %d",fibonacci(index));
                break;
            case 2 :
                int n = Lib.readInt("Combien de valeurs :");
                nFibonacci(n);
                break;
            default:
                System.out.println("Pas d'exercice correspondant");
        }
    }
}