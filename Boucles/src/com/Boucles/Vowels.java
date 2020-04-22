package com.Boucles;

import java.util.Scanner;

public class Vowels {
    final static Scanner READ = new Scanner(System.in);

    // Vowels
    public static int vowelsInStr(String str) {
        int vowels = 0;
        int len = str.length();
        // From end to start
        while (--len >= 0)
            vowels += (str.charAt(len) == 65
                    || str.charAt(len) == 69
                    || str.charAt(len) == 73
                    || str.charAt(len) == 79
                    || str.charAt(len) == 85
                    || str.charAt(len) == 89)
                    ? 1 : 0;

        return vowels;
    }

    // MAIN
    public static void main(String[] args) {
        System.out.println("**** Nombre de voyelles (V1.0 - 04/20) ****");

        // String and her length
        System.out.println("Entrez la phrase pour connaître le nombre de voyelle :");
        String str = READ.nextLine().toUpperCase();

        // Result
        System.out.printf("La phrase contient %d voyelles", vowelsInStr(str));
    }
}
