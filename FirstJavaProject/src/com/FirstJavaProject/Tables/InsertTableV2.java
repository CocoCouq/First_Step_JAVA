package com.FirstJavaProject.Tables;

import com.FirstJavaProject.Lib;

import java.util.ArrayList;

public class InsertTableV2 {
    // Insert table
    public static void insertTable(ArrayList<Double> tab, int len) {
        int i = -1;
        while (++i < len)
            tab.add(Lib.readDouble("Nombre suivant :"));
    }

    /* EXECUTE */
    public static void exec() {
        System.out.println("|| Insertion (Array List)              (V1.1 - 04/20) ||");

        // Define length
        int len = Lib.readInt("Quelle est la taille du tableau :");

        // Insert table
        ArrayList<Double> tab = new ArrayList<Double>();
        insertTable(tab, len);

        // Display result
        System.out.println(tab);
    }
}
