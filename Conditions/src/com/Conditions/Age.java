package com.Conditions;

import java.util.Calendar;
import java.util.Scanner;

public class Age {
    // SCANNER AND CURRENT YEAR
    final static Scanner READ = new Scanner(System.in);
    final static int YEAR = Calendar.getInstance().get(Calendar.YEAR);

    // MAIN
    public static void main(String[] args) {
        System.out.println("**** Age (V1.0 - 04/20) ****");

        System.out.println("Votre année de naissance :");
        int year = READ.nextInt();

        // Result
        System.out.println(YEAR-year);
    }
}
