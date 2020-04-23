package com.Tableaux;

import java.util.ArrayList;
import java.util.Scanner;

public class InsertTableV2 {
    final static Scanner READ = new Scanner(System.in);

    // Insert table
    public static void insertTable(ArrayList<Double> tab,int len) {
        int i = -1;
        while (++i < len) {
            System.out.printf("Nombre %d :%n", i+1);
            tab.add(READ.nextDouble());
        }
    }

    // MAIN
    public static void main(String[] args) {
        System.out.println("**** Tableau (ArrayList) (V1.0 - 04/20) ****");

        // Define length
        System.out.println("Quelle est la taille du tableau :");
        int len = READ.nextInt();

        // Insert table
        ArrayList<Double> tab = new ArrayList<Double>();
        insertTable(tab, len);

        // Display result
        System.out.println(tab);
    }
}
