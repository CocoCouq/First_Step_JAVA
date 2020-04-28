package com.FirstJavaProject.Objects;

import com.FirstJavaProject.Lib;

public class CallShape {
    /* EXECUTE */
    public static void exec() {
        System.out.println("|| Forme                  (V1.0 - 04/20) ||");

        // Define base and height
        double base = Lib.readDouble("Quelle est la base :");
        double height = Lib.readDouble("Quelle est la hauteur :");

        Triangle triangle = new Triangle(base, height);

        System.out.printf("Aire est de %f", triangle.area());
    }
}