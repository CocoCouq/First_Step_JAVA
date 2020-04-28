package com.FirstJavaProject.Objects;

import com.FirstJavaProject.Lib;

import java.util.Arrays;

public class SortTable {
    public int len;
    public long[] tab;

    // Define length
    public void initTable() {
        this.len = Lib.readInt("Quelle est la taille du tableau :");
        this.tab = new long[this.len];
    }

    // Insert table
    public void insertTab() {
        // Insert table
        int i = -1;
        while (++i < this.len)
            this.tab[i] = Lib.readLong("Renseignez l'entier suivant :");
    }

    // Sort table
    public void sortTable() {
        Arrays.sort(this.tab);
    }

    // Display table
    public void displayTab() {
        // Display table content
        int i = -1;
        while (++i < this.len)
            System.out.printf("Index %d : %d %n", i, this.tab[i]);
    }
}
