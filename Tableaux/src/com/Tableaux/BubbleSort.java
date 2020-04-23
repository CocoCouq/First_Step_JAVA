package com.Tableaux;

import java.util.Scanner;

public class BubbleSort {
    final static Scanner READ = new Scanner(System.in);

    // To define double
    public static long readLong(int index) {
        System.out.printf("Entrez l'entier nº%d du tableau %n", index+1);
        long number = READ.nextLong();
        return number;
    }

    // Insert table
    public static long[] insertTab(int len) {
        // Define table length
        long[] tab = new long[len];
        // Insert table
        int i = -1;
        while (++i < len)
            tab[i] = readLong(i);

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

    // MAIN
    public static void main(String[] args) {
        System.out.println("**** Tri a bulles (V1.0 - 04/20) ****");

        // Define table
        System.out.println("Quelle taille de tableau à trier ?");
        int len = READ.nextInt();

        // Insert table
        long[] tab = insertTab(len);

        // Sort
        bubbleSort(tab);

        // Show result
        System.out.println("Résultat :");
        displayTab(tab, len);
    }
}
