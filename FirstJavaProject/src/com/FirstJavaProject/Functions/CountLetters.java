package com.FirstJavaProject.Functions;

import java.util.Scanner;

public class CountLetters {
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

    /* EXECUTE */
    public static void exec() {
        System.out.println("|| Compteur de lettres                  (V1.1 - 04/20) ||");

        Scanner scanner = new Scanner(System.in);
        // Define string and letter
        System.out.println("Entrez le phrase :");
        String str = scanner.nextLine();
        System.out.println("Entrez le caractère a chercher");
        String c = scanner.next();

        // Result
        System.out.printf("Il y %d fois la lettre %s", countLetters(str, c), c);
    }
}