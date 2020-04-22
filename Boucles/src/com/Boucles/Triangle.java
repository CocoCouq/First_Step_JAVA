package com.Boucles;

import java.util.Scanner;

public class Triangle {
    final static Scanner READ = new Scanner(System.in);

    // Write triangle
    public static void displayTriangle(int height) {
        // To have a dynamic height
        int heightSave = height;
        int i = 0, j = 1, k = 0;

        while (++i <= height) {
            // Loop for display *
            while (k++ < j) {
                // Loop for display SPC (j / 2 because base = height * 2 - 1)
                // So center the triangle with one more space by line
                while ((heightSave-- - (j / 2)) > 0)
                    System.out.print(" ");
                System.out.print("*");
            }
            System.out.printf("%n");
            // Reinitialize for next loop
            heightSave = height;
            k = 0;
            j += 2;
        }
    }

    // MAIN
    public static void main(String[] args) {
        System.out.println("**** Triangle isocèle (V1.0 - 04/20) ****");

        // Height
        System.out.println("Quelle hauteur de triangle ?");
        int height = READ.nextInt();

        // Call function
        displayTriangle(height);
    }
}
