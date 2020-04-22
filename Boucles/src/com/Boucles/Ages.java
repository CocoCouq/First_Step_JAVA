package com.Boucles;

import java.util.Scanner;

public class Ages {
    final static Scanner READ = new Scanner(System.in);

    // MAIN
    public static void main(String[] args) {
        System.out.println("**** Tranches d'ages (V1.0 - 04/20) ****");
        int u20 = 0, s40 =0, betw= 0;

        // First personne
        System.out.println("Saisissez l'age de la premiere personne :");
        int currentAge = READ.nextInt();

        // Check age and add one to category
        while (currentAge < 100) {
            u20 += currentAge < 20 ? 1 : 0;
            s40 += currentAge > 40 ? 1 : 0;
            betw += (currentAge >= 20 && currentAge <= 40) ? 1 : 0;
            
            // new value
            System.out.println("Entrez un nouvel age ou terminez par le centenaire :");
            currentAge = READ.nextInt();
        }
        // Add the centenary
        s40++;

        // Result
        System.out.printf("Moins de 20 ans: %d%nDe 20 à 40 ans: %d%nPlus de 40ans: %d%n", u20, betw, s40);
    }
}
