package com.Boucles;

import java.util.Scanner;

public class SumInferiors {
    final static Scanner READ = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("**** Sommes des inférieurs à N (V1.0 - 04/20) ****");

        long result = 0;
        System.out.println("Renseignez le nombre :");
        long number = READ.nextLong();

        // Result
        while (--number > 0)
            result += number;

        System.out.print("Resultat : ");
        System.out.println(result);
    }
}
