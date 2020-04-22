package com.Boucles;

import java.util.Scanner;

public class InferiorInt {
    public static Scanner READ = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("**** Réels inférieurs à N (V1.0 - 04/20) ****");

        System.out.println("Quel est le nombre :");
        long number = READ.nextLong();

        // Result
        while (number >= 0)
            System.out.println(number--);
    }
}
