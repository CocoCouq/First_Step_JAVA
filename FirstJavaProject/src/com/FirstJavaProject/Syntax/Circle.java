package com.FirstJavaProject.Syntax;

import com.FirstJavaProject.Lib;

public class Circle {
    final static double PI=3.1416;

    // Circumference
    public static double circon(double radius) {
        return 2 * PI * radius;
    }

    // Surface
    public static double surface(double radius) {
        return PI * Math.pow(radius, 2);
    }

    // Display result
    public static void displayCircle(double circ, double surf) {
        System.out.printf("La circonférence est de: %f%n", circ);
        System.out.printf("La surface est de: %f%n", surf);
    }

    /* EXECUTE */
    public static void circle() {
        System.out.println("|| Circonférence/Surface du Cercle (V1.1 - 04/20) ||");

        // Radius
        double radius = Lib.readDouble("Quel est le rayon :");

        // Circumference
        double circ = circon(radius);

        // Surface
        double surf = surface(radius);

        // Result
        displayCircle(circ, surf);
    }
}
