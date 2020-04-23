package com.Fonctions;

import java.util.Scanner;

public class CountLetters {
    final static Scanner READ = new Scanner(System.in);

    // To count where is equal
    public static int countLetters(String str, String c) {
        str = str.toLowerCase();
        c = c.toLowerCase();
        // Pass strings to char and table of char
        char[] tabStr = c.toCharArray();
        char ch = tabStr[0];
        tabStr = str.toCharArray();

        // Count
        int i = -1, count = 0;
        while (++i < tabStr.length)
            count += tabStr[i] == ch ? 1 : 0;
        return count;
    }

    // MAIN
    public static void main(String[] args) {
        System.out.println("**** Nombres de fois la lettre  (V1.0 - 04/20) ****");

        // Define string and letter
        System.out.println("Entrez le phrase :");
        String str = READ.nextLine();
        System.out.println("Entrez le caractère a chercher");
        String c = READ.next();

        // Result
        System.out.printf("Il y %d fois la lettre %s", countLetters(str, c), c);
    }
}
