package com.Tableaux;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteValue {
    final static Scanner READ = new Scanner(System.in);

    // Display table
    public static void displayTable(String[] tab) {
        int i = -1;
        while (++i < tab.length) {
            System.out.printf("%d : %s %n", i+1, tab[i]);
        }
    }

    // Replace name
    public static void catchName(String[] tab, String str) {
        // All variables
        int i = -1, j = -1, k = 0, sv = 0, lenStr = -1;
        int len = tab.length - 1;
        // Test
        while (++i != len+1 && sv != lenStr) {
            lenStr = str.length() - 1;

            while (++j != lenStr)
                k += tab[i].charAt(j) == str.charAt(j) ? 1 : 0;
            // Save value before reinitialize k
            sv = k == lenStr ? k : sv;
            k = 0;
            j = -1;
        }
        i -= 2; // To stay on number (increment before loop in the next while)

        // If name is in table
        if (sv == lenStr) {
            while (++i != len)
                tab[i] = tab[i + 1];
            tab[i] = "";
        }
    }

    public static void main(String[] args) {
        System.out.println("**** Suppression d'un prenom (V1.0 - 04/20) ****");

        // Define table
        String[] tabFisrtN = {
                "Jean" ,"Pierre", "Paul", "Michel", "Peter",
                "Franck", "Sylvie", "Eric", "Audrey", "Lucie",
                "Jesus", "Marie", "Joseph", "Marc", "Julie",
                "Armand", "Germain", "Cris", "John", "Harry"
        };

        // Display table
        System.out.println("Le tableau comprend les prénoms :");
        displayTable(tabFisrtN);

        // Define Value to delete
        System.out.println("Quelle prenom voulez-vous retirer ?");
        String str = READ.next();

        // Catch name
        catchName(tabFisrtN, str);

        // Display result
        displayTable(tabFisrtN);
    }
}
