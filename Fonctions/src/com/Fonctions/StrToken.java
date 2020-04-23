package com.Fonctions;

import java.util.Scanner;

public class StrToken {
    final static Scanner READ = new Scanner(System.in);

    public static StringBuilder stringToken(String str, String c, int index) {

        StringBuilder result = new StringBuilder();
        int i = -1, len = str.length();

        while (index > 1 && len-- > 0) // If search char index 2, first, find index 1 and after index 2
            index -= str.charAt(++i) == c.charAt(0) ? 1 : 0; // Add one to i before testing condition

        while (str.charAt(++i) != c.charAt(0) && len-- > 0)
            result.append(str.charAt(i));

        return result;
    }

    // MAIN
    public static void main(String[] args) {
        System.out.println("**** String Token  (V1.0 - 04/20) ****");

        // Define strings
        System.out.println("Quelle est la phrase ?");
        String str = READ.nextLine();
        System.out.println("Séparateur :");
        String c = READ.next();
        System.out.println("Index :");
        int index = READ.nextInt();

        // Result
        System.out.println(stringToken(str, c, index));
    }
}
