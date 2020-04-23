package com.Fonctions;

import java.util.Scanner;

public class Fibonacci {
    final static Scanner READ = new Scanner(System.in);

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

    public static void main(String[] args) {
        System.out.println("**** Fibonacci  (V1.0 - 04/20) ****");

        System.out.printf("CHOISISSEZ :%n%n1:Valeur a un index%n2:Premières valeurs%n");
        int exo = READ.nextInt();

        // Choice exercice
        switch (exo) {
            case 1 :
                System.out.println("Quel index :");
                int index = READ.nextInt();
                System.out.printf("Resultat: %d",fibonacci(index));
                break;
            case 2 :
                System.out.println("Combien de valeurs :");
                int n = READ.nextInt();
                nFibonacci(n);
                break;
            default:
                System.out.println("Pas d'exercice correspondant");
        }
    }
}
