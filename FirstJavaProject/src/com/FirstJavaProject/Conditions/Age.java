package com.FirstJavaProject.Conditions;

import com.FirstJavaProject.Lib;

import java.util.Calendar;

public class Age {
    // Current year
    final static int YEAR = Calendar.getInstance().get(Calendar.YEAR);

    /* EXECUTE */
    public static void exec() {
        System.out.println("|| Age                             (V1.1 - 04/20) ||");

        int year = Lib.readInt("Votre année de naissance :");

        // Result
        System.out.printf("Cela fait %d ans", YEAR - year);
    }
}
