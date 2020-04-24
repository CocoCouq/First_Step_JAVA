package com.FirstJavaProject.Loops;

import com.FirstJavaProject.Lib;

public class MinAndMax {
    /* EXECUTE */
    public static void exec() {
        System.out.println("|| Min et Max                       (V1.1 - 04/20) ||");

        double sum = 0;
        int i = 0;

        System.out.println("TERMINEZ LA SAISIE PAR 0");
        // First number
        double number = Lib.readDouble("Saisissez le nombre :");
        double max = number;
        double min = max;

        // Sum, min and max
        while(number != 0){
            sum += number;
            min = Math.min(min, number);
            max = Math.max(max, number);
            number = Lib.readDouble("Nombre suivant :");
            i++;
        }

        // Result
        System.out.printf("Moyenne: %f%nMin: %f%nMax: %f", sum/i, min, max);
    }
}
