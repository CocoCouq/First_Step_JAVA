package com.FirstJavaProject.Operators;

import com.FirstJavaProject.Lib;

public class Div{
    /* EXECUTE */
    public static void exec() {
        System.out.println("|| Division                        (V1.1 - 04/20) ||");

        double nbr1 = Lib.readDouble("Nombre à diviser :");
        double nbr2 = Lib.readDouble("Divisé par : ");

        if (nbr2 != 0)
            System.out.printf("Resultat : %f", nbr1 / nbr2);
        else
            System.out.println("On ne peux pas diviser par 0");
    }
}
