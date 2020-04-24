package com.FirstJavaProject.Loops;

import com.FirstJavaProject.Lib;

public class InferiorInt {
    /* EXECUTE */
    public static void exec() {
        System.out.println("|| Inférieurs à N                    (V1.1 - 04/20) ||");

        long number = Lib.readLong("Quel est le nombre :");

        // Result
        while (number >= 0)
            System.out.println(number--);
    }
}