package com.FirstJavaProject.Functions;

import java.util.Scanner;

public class CountWord {
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

    /* EXECUTE */
    public static void exec() {
        System.out.println("|| Compteur de mots                   (V1.1 - 04/20) ||");

        Scanner scanner = new Scanner(System.in);
        // Ask string and word
        System.out.println("Phrase :");
        String str = scanner.nextLine();

        // Result
        System.out.printf("La phrase contient %d mots", countWords(str));
    }
}
