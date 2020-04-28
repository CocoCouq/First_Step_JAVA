package com.FirstJavaProject.Objects;

import com.FirstJavaProject.Lib;

public class CallSortTable {
    /* EXECUTE */
    public static void exec() {
        System.out.println("|| Tri de Tableau                  (V1.1 - 04/20) ||");

        // Call class
        SortTable sortTable = new SortTable();

        // Define len
        sortTable.initTable();
        // Insert table
        sortTable.insertTab();
        // Sort table
        sortTable.sortTable();
        // Show result
        sortTable.displayTab();
    }
}
