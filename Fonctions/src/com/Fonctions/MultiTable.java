package com.Fonctions;

import java.util.Scanner;

public class MultiTable {
    final static Scanner READ = new Scanner(System.in);

    public static void multipleTab(int nbr) {
        int i = -1;
        while (++i <= 10)
            System.out.printf("%d x %d = %d%n",i ,nbr, nbr*i);
    }

    // MAIN
    public static void main(String[] args) {
        System.out.println("**** Table de Multiplications  (V1.0 - 04/20) ****");

        // Table
        System.out.println("Quelle table voulez vous ?");
        int nbr = READ.nextInt();

        // Display
        multipleTab(nbr);
    }
}
