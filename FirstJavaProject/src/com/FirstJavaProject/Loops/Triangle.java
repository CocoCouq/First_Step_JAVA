package com.FirstJavaProject.Loops;

import com.FirstJavaProject.Lib;

public class Triangle {
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

    /* EXECUTE */
    public static void exec() {
        System.out.println("|| Triangle                        (V1.1 - 04/20) ||");

        // Height
        int height = Lib.readInt("Quelle hauteur de triangle ?");

        // Call function
        displayTriangle(height);
    }
}