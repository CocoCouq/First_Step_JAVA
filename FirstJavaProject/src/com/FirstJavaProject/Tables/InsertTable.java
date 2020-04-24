package com.FirstJavaProject.Tables;

import com.FirstJavaProject.Lib;

public class InsertTable {
    // Insert table
    public static double[] insertTab(int len) {
        // Define table length
        double[] tab = new double[len];
        // Insert table
        int i = -1;
        while (++i < len)
            tab[i] = Lib.readDouble("Entrez la valeur à inserrer");

        return tab;
    }

    // Display tab
    public static void displayTab(double[] tab,int len) {
        // Display table content
        int i = -1;
        while (++i < len)
            System.out.printf("Valeur %d : %f%n", i+1, tab[i]);
    }

    /* EXECUTE */
    public static void exec() {
        System.out.println("|| Insertion                        (V1.1 - 04/20) ||");

        // Define table
        int len = Lib.readInt("Quelle est la taille du tableau :");

        // Insert table
        double[] tab = insertTab(len);

        // Show table
        displayTab(tab, len);
    }
}
