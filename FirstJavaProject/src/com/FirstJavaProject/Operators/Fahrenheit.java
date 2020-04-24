package com.FirstJavaProject.Operators;

import com.FirstJavaProject.Lib;

public class Fahrenheit {
    // Convert in Fahrenheit
    public static double convertFah(double fah) {
        return ((fah - 32) * 5) / 9;
    }

    /* EXECUTE */
    public static void exec() {
        System.out.println("|| Fahrenheit                      (V1.1 - 04/20) ||");

        // ºF
        double fah = Lib.readDouble("Quelle est la température Fahrenheit ?");

        // Result
        System.out.printf("Il fait %fºC", convertFah(fah));
    }
}
