package com.FirstJavaProject.Functions;

import java.util.Scanner;

public class Concat {
    // Concat strings
    public static String concat(String str1, String str2) {
        return str1+str2;
    }

    /* EXECUTE */
    public static void exec() {
        System.out.println("|| Concaténation                       (V1.1 - 04/20) ||");

        Scanner scanner = new Scanner(System.in);
        // Ask strings
        System.out.println("String 1 :");
        String str1 = scanner.nextLine();
        System.out.println("String 2 :");
        String str2 = scanner.nextLine();

        // Result
        System.out.printf("Resultat: %s%n", concat(str1, str2));
    }
}
