package com.FirstJavaProject.Syntax;

import com.FirstJavaProject.Lib;

public class Swap {
    /* EXECUTE */
    public static void exec() {
        System.out.println("|| Swap                            (V1.1 - 04/20) ||");

        // Define Value
        double nX = Lib.readDouble("Nombre nX : (Renseignez)");
        double nY = Lib.readDouble("Nombre nY : (Renseignez)");

        // Swap
        double temp = nY;
        nY = nX;
        nX = temp;

        System.out.printf("nX: %f -- nY: %f", nX, nY);
    }
}
