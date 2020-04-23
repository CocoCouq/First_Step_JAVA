package com.Tableaux;

import java.util.Scanner;

public class InsertTable {
    final static Scanner READ = new Scanner(System.in);

    // To define double
    public static double readDouble(int index) {
        System.out.printf("Entrez la valeur %d du tableau %n", index+1);
        double number = READ.nextDouble();
        return number;
    }

    // Insert table
    public static double[] insertTab(int len) {
        // Define table length
        double[] tab = new double[len];
        // Insert table
        int i = -1;
        while (++i < len)
            tab[i] = readDouble(i);

        return tab;
    }

    // Display tab
    public static void displayTab(double[] tab,int len) {
        // Display table content
        int i = -1;
        while (++i < len)
            System.out.printf("Valeur %d : %f%n", i+1, tab[i]);
    }

    // MAIN
    public static void main(String[] args) {
        System.out.println("**** Tableau et suppression de valeurs (V1.0 - 04/20) ****");

        // Define table
        System.out.println("Quelle est la taille du tableau :");
        int len = READ.nextInt();

        // Insert table
        double[] tab = insertTab(len);

        // Show table
        displayTab(tab, len);
    }
}
