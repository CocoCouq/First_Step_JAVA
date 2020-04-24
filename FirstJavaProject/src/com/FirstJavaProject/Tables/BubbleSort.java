package com.FirstJavaProject.Tables;

import com.FirstJavaProject.Lib;

public class BubbleSort {
    // Insert table
    public static long[] insertTab(int len) {
        // Define table length
        long[] tab = new long[len];
        // Insert table
        int i = -1;
        while (++i < len)
            tab[i] = Lib.readLong("Renseignez l'entier suivant :");

        return tab;
    }

    // Display tab
    public static void displayTab(long[] tab, int len) {
        // Display table content
        int i = -1;
        while (++i < len)
            System.out.printf("Index %d : %d %n", i, tab[i]);
    }

    // Bubble sort
    public static void bubbleSort(long[] tab) {
        // To swap value
        long temp;
        int i = -1;
        int len = tab.length;
        // Bubble sort loop
        while (--len > 0) {
            while (++i < len) {
                // Compare value with next
                if (tab[i] > tab[i+1]) {
                    // Swap value
                    temp = tab[i+1];
                    tab[i+1] = tab[i];
                    tab[i] = temp;
                }
            }
            i = -1;
        }
    }

    /* EXECUTE */
    public static void exec() {
        System.out.println("|| Bubble Sort                         (V1.1 - 04/20) ||");

        // Define table
        int len = Lib.readInt("Quelle taille de tableau à trier ?");

        // Insert table
        long[] tab = insertTab(len);

        // Sort
        bubbleSort(tab);

        // Show result
        System.out.println("Résultat :");
        displayTab(tab, len);
    }
}
