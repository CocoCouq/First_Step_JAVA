package com.FirstJavaProject.Conditions;

import com.FirstJavaProject.Lib;

public class EvenNumber {
    /* EXECUTE */
    public static void exec() {
        System.out.println("|| Parité                          (V1.1 - 04/20) ||");

        long number = Lib.readLong("Entrez un nombre :");

        // If even or not
        String result = number % 2 == 0 ? "Pair" : "Impair";

        System.out.println(result);
    }
}
