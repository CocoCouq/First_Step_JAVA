package com.FirstJavaProject.Operators;

import com.FirstJavaProject.Lib;

public class ConvertCode {
    /* EXECUTE */
    public static void exec() {
        System.out.println("|| ASCII code                     (V1.1 - 04/20) ||");

        int code = Lib.readInt("Renseignez le code ascii :");

        // Display
        System.out.printf("Correspond à: %c", code);
    }
}
