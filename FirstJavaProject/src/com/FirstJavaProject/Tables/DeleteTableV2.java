package com.FirstJavaProject.Tables;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.UnaryOperator;

public class DeleteTableV2 {
    // Test, delete value and return array list
    public static void deleteValue(ArrayList<String> tab, String str) {
        // To lower case
        UnaryOperator<String> lower = String::toLowerCase;
        tab.replaceAll(lower);
        str = str.toLowerCase();

        // Test
        int i = -1;
        while (++i < tab.size()) {
            if (tab.get(i).equals(str))
                tab.remove(i);
        }
    }

    // Display tab
    public static void displayTable(ArrayList<String> tab) {
        System.out.println("Le tableau contient :");
        tab.forEach(System.out::println);
    }

    /* EXECUTE */
    public static void exec() {
        System.out.println("|| Suppression (Array List)                 (V1.1 - 04/20) ||");

        Scanner scanner = new Scanner(System.in);
        // Define table with just 5 names
        ArrayList<String> tabName = new ArrayList<>();
        tabName.add("Sophie");
        tabName.add("Marc");
        tabName.add("John");
        tabName.add("Estelle");
        tabName.add("Franck");

        // Display tab value
        displayTable(tabName);

        // Ask name
        System.out.println("Quel nom souhaitez-vous retirer");
        String name = scanner.next();

        deleteValue(tabName, name);

        // Display Result
        displayTable(tabName);
    }
}