package com.Boucles;

import java.util.Scanner;

public class MagicNumber {
    final static Scanner READ = new Scanner(System.in);
    final static int MAGIC = (int)(Math.random() * 100);

    // Magic function
    public static void magicNumber() {
        // -1 can't be MAGIC
        int nbr = -1;
        String str;

        while (nbr != MAGIC) {
            System.out.println("Choisissez un nombre :");
            nbr = READ.nextInt();

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

    // MAIN
    public static void main(String[] args) {
        System.out.println("**** Magic Number (V1.0 - 04/20) ****");

        // Call Magic function
        magicNumber();
    }
}
