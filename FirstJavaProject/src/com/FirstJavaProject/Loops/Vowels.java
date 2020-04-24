package com.FirstJavaProject.Loops;

import com.FirstJavaProject.Lib;

import java.util.Scanner;

public class Vowels {
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

    /* EXECUTE */
    public static void exec() {
        System.out.println("|| Voyelles                        (V1.1 - 04/20) ||");

        Scanner scanner = new Scanner(System.in);

        // String and her length
        System.out.println("Entrez la phrase pour connaître le nombre de voyelle :");
        String str = scanner.nextLine().toUpperCase();

        // Result
        System.out.printf("La phrase contient %d voyelles", vowelsInStr(str));
    }
}
