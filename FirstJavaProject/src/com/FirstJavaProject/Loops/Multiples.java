package com.FirstJavaProject.Loops;

import com.FirstJavaProject.Lib;

public class Multiples {
    /* EXECUTE */
    public static void exec() {
        System.out.println("|| Multiples                        (V1.1 - 04/20) ||");

        // Numbers
        int number = Lib.readInt("Quel nombre voulez-vous multiplier ?");
        int multiple = Lib.readInt("Combien de fois ?");

        // Return table
        while (multiple > 0)
            System.out.printf("%d X %d = %d%n", number, multiple, number * multiple--);

    }
}
