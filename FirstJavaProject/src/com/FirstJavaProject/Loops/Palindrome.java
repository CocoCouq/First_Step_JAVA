package com.FirstJavaProject.Loops;

import java.util.Scanner;

public class Palindrome {
    // Return true if is palindrome
    public static boolean isPal(String str) {
        // Length
        int len = str.length(), i = 0;

        // Test first with last, second with second to last,... to the middle
        while (--len >= (str.length()/2)) {
            if (str.charAt(len) != str.charAt(i++))
                return false;
        }
        return true;
    }

    /* EXECUTE */
    public static void exec() {
        System.out.println("|| Palindrome                      (V1.1 - 04/20) ||");

        Scanner scanner = new Scanner(System.in);
        // Read string or word
        System.out.println("Que voulez-vous tester ?");
        String str = scanner.nextLine().toLowerCase();

        // Check and display result
        if (isPal(str))
            System.out.println("C'est un palindrome");
        else
            System.out.print("Ce n'est pas un palindrome");
    }
}
