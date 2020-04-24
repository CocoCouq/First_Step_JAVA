package com.FirstJavaProject.Loops;

import com.FirstJavaProject.Lib;

public class Age {
    /* EXECUTE */
    public static void exec() {
        System.out.println("|| Parité                          (V1.1 - 04/20) ||");

        int u20 = 0, s40 =0, betw= 0;

        // First personne
        int currentAge = Lib.readInt("Saisissez l'age de la premiere personne :");

        // Check age and add one to category
        while (currentAge < 100) {
            u20 += currentAge < 20 ? 1 : 0;
            s40 += currentAge > 40 ? 1 : 0;
            betw += (currentAge >= 20 && currentAge <= 40) ? 1 : 0;

            // new value
            currentAge = Lib.readInt("Entrez un nouvel age ou terminez par le centenaire :");
        }
        // Add the centenary
        s40++;

        // Result
        System.out.printf("Moins de 20 ans: %d%nDe 20 à 40 ans: %d%nPlus de 40ans: %d%n", u20, betw, s40);
    }
}
