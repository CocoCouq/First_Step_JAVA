package com.FirstJavaProject.Conditions;

import com.FirstJavaProject.Lib;

public class Contributions {
    public static int calcContrib() {
        // Married or not
        char married = Lib.readChar("Etes vous marié ? (oui/non)");
        int contrib = married == 111 ? 25 : 20;

        // Children
        int children = Lib.readInt("Combien avez-vous d'enfants ?");
        contrib += (10 * children);

        // Salary
        int salary = Lib.readInt("Combien gagnez-vous ?");
        contrib += salary < 1200 ? 10 : 0;

        // Contrib max
        contrib = Math.min(contrib, 50);

        return contrib;
    }

    /* EXECUTE */
    public static void exec() {
        System.out.println("|| Participations repas                (V1.1 - 04/20) ||");

        // Contribution
        int contrib = calcContrib();

        // Result
        System.out.printf("Participation : %d", contrib);
    }
}