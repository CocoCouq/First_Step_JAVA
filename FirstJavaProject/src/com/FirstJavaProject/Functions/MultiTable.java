package com.FirstJavaProject.Functions;

import com.FirstJavaProject.Lib;

public class MultiTable {
    // Multiplication tables
    public static void multipleTab(int nbr) {
        int i = -1;
        while (++i <= 10)
            System.out.printf("%d x %d = %d%n",i ,nbr, nbr*i);
    }

    /* EXECUTE */
    public static void exec() {
        System.out.println("|| Tables de multiplications         (V1.1 - 04/20) ||");

        // Table
        int nbr = Lib.readInt("Quelle table voulez vous ?");

        // Display
        multipleTab(nbr);
    }
}
