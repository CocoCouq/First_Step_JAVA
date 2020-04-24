package com.FirstJavaProject.Loops;

import com.FirstJavaProject.Lib;

public class MagicNumber {
    final static int MAGIC = (int)(Math.random() * 100);

    // Magic function
    public static void magicNumber() {
        // -1 can't be MAGIC
        int nbr = -1;
        String str;

        while (nbr != MAGIC) {
            nbr = Lib.readInt("Choisissez un nombre :");

            // Test
            if (nbr < MAGIC)
                str = "Plus grand";
            else if (nbr > MAGIC)
                str = "Plus petit";
            else
                str = "Bravo";

            System.out.println(str);
        }
    }

    /* EXECUTE */
    public static void exec() {
        System.out.println("|| Magic Number                        (V1.1 - 04/20) ||");

        // Call Magic function
        magicNumber();
    }
}