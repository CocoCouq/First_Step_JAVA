package com.FirstJavaProject.Functions;

import java.util.Scanner;

public class StrToken {
    // Function String Token
    public static StringBuilder stringToken(String str, String c, int index) {

        StringBuilder result = new StringBuilder();
        int i = -1, len = str.length();

        while (index > 1 && len-- > 0) // If search char index 2, first, find index 1 and after index 2
            index -= str.charAt(++i) == c.charAt(0) ? 1 : 0; // Add one to i before testing condition

        while (str.charAt(++i) != c.charAt(0) && len-- > 0)
            result.append(str.charAt(i));

        return result;
    }

    /* EXECUTE */
    public static void exec() {
        System.out.println("|| String Token                       (V1.1 - 04/20) ||");

        Scanner scanner = new Scanner(System.in);
        // Define strings
        System.out.println("Quelle est la phrase ?");
        String str = scanner.nextLine();
        System.out.println("Séparateur :");
        String c = scanner.next();
        System.out.println("Index :");
        int index = scanner.nextInt();

        // Result
        System.out.println(stringToken(str, c, index));
    }
}