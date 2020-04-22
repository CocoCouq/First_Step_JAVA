package com.Conditions;

import java.util.Scanner;

public class EvenNumber {
    final static Scanner READ = new Scanner(System.in);

    // MAIN
    public static void main(String[] args) {
        System.out.println("**** Parité (V1.0 - 04/20) ****");

        System.out.println("Entrez un nombre :");
        long number = READ.nextLong();

        // If even or not
        String result = number % 2 == 0 ? "Pair" : "Impair";

        System.out.println(result);
    }
}