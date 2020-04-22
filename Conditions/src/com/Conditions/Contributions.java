package com.Conditions;

import java.util.Scanner;

public class Contributions {
    final static Scanner READ = new Scanner(System.in);

    public static int calcContrib() {
        // Married or not
        System.out.println("Etes vous marié ? (oui/non)");
        String married = READ.next();
        int contrib = married.charAt(0) == 111 ? 25 : 20;

        // Children
        System.out.println("Combien avez-vous d'enfants ?");
        int children = READ.nextInt();
        contrib += (10 * children);

        // Salary
        System.out.println("Combien gagnez-vous ?");
        int salary = READ.nextInt();
        contrib += salary < 1200 ? 10 : 0;

        // Contrib max
        contrib = Math.min(contrib, 50);

        return contrib;
    }

    // MAIN
    public static void main(String[] args) {
        System.out.println("**** Participation (V1.0 - 04/20) ****");

        // Contribution
        int contrib = calcContrib();

        // Result
        System.out.print("Participation : ");
        System.out.println(contrib);
    }
}
