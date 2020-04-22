package com.Boucles;

import java.util.Scanner;

public class Palindrome {
    final static Scanner READ = new Scanner(System.in);

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

    // MAIN
    public static void main(String[] args) {
        System.out.println("**** Palindrome (V1.0 - 04/20) ****");

        // Read string or word
        System.out.println("Que voulez-vous tester ?");
        String str = READ.nextLine();

        // Check and display result
        if (isPal(str))
            System.out.println("C'est un palindrome");
        else
            System.out.print("Ce n'est pas un palindrome");
    }
}
