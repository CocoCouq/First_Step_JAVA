package com.Fonctions;

import java.util.Scanner;

public class CountWord {
    final static Scanner READ = new Scanner(System.in);

    // Count words
    public static int countWords(String str) {
        int i = -1, count = 0;
        int len = str.length();
        // Make allow space at end
        char[] tabStr = str.toCharArray();
        tabStr[tabStr.length - 1] = 32;
        str = String.valueOf(tabStr);

        // Count
        while (++i < len) {
            if (str.charAt(i) == 32)
                count++;
        }
        return count;
    }

    // MAIN
    public static void main(String[] args) {
        System.out.println("**** Nombre de mots (V1.0 - 04/20) ****");

        // Ask string and word
        System.out.println("String :");
        String str = READ.nextLine();

        // Result
        System.out.printf("La phrase contient %d mots", countWords(str));
    }
}
