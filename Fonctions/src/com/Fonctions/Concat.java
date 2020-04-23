package com.Fonctions;

import java.util.Scanner;

public class Concat {
    final static Scanner READ = new Scanner(System.in);

    // Concat strings
    public static String concat(String str1, String str2) {
        return str1+str2;
    }

    // MAIN
    public static void main(String[] args) {
        System.out.println("**** Concatenation (V1.0 - 04/20) ****");

        // Ask strings
        System.out.println("String 1 :");
        String str1 = READ.nextLine();
        System.out.println("String 2 :");
        String str2 = READ.nextLine();

        // Result
        System.out.printf("Resultat: %s%n", concat(str1, str2));
    }
}
