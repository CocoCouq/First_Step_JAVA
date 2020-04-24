package com.FirstJavaProject.Operators;

import com.FirstJavaProject.Lib;

public class Average {
    // Average
    public static double average(double[] tab) {
        double sum = 0;
        int i = -1;

        while (++i < tab.length)
            sum += tab[i];

        return sum / tab.length;
    }

    /* EXECUTE */
    public static void exec() {
        System.out.println("|| Moyenne                        (V1.1 - 04/20) ||");

        // Notes
        double[] notes = new double[3];
        notes[0] = Lib.readDouble("Resultat du devoir à la Maison :");
        notes[1] = Lib.readDouble("Resultat du devoir écrit :");
        notes[2] = Lib.readDouble("Resultat du devoir oral :");

        // Result
        System.out.printf("Moyenne de %f", average(notes));
    }
}
