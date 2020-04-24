package com.FirstJavaProject.Loops;

import com.FirstJavaProject.Lib;

public class Average {
    /* EXECUTE */
    public static void exec() {
        System.out.println("|| Moyenne                        (V1.1 - 04/20) ||");

        double sum = 0;
        int i = 0;

        System.out.println("TERMINEZ LA SAISIE PAR 0");
        // First number
        double number = Lib.readDouble("Saisissez le nombre :");

        // Sum
        while(number != 0){
            sum += number;
            number = Lib.readDouble("Nombre suivant :");
            i++;
        }

        // Result
        System.out.printf("Moyenne : %f", sum / i);
    }
}