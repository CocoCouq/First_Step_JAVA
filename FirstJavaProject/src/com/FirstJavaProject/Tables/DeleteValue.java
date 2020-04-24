package com.FirstJavaProject.Tables;

import java.util.Scanner;

public class DeleteValue {
    // Display table
    public static void displayTable(String[] tab) {
        int i = -1;
        while (++i < tab.length) {
            System.out.printf("%d : %s %n", i+1, tab[i]);
        }
    }

    // Replace name
    public static void catchName(String[] tab, String str) {
        // Save table to lower case
        String[] tabL = new String[tab.length];
        int l = -1;
        for (String s : tabL) {
            tabL[++l] = tab[l].toLowerCase();
        }
        str = str.toLowerCase();

        // All variables
        int i = -1, j = -1, k = 0, sv = 0, lenStr = -1;
        int len = tabL.length - 1;

        // Test
        while (++i != len+1 && sv != lenStr) {
            lenStr = str.length() - 1;

            while (++j != lenStr)
                k += tabL[i].charAt(j) == str.charAt(j) ? 1 : 0;
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

    /* EXECUTE */
    public static void exec() {
        System.out.println("|| Suppression                       (V1.1 - 04/20) ||");

        Scanner scanner = new Scanner(System.in);
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
        String str = scanner.next();

        // Catch name
        catchName(tabFisrtN, str);

        // Display result
        displayTable(tabFisrtN);
    }
}