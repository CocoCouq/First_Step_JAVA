package com.FirstJavaProject.Objects;

import com.FirstJavaProject.Lib;

public class CallShape {
    /* EXECUTE */
    public static void exec() {
        System.out.println("|| Forme                  (V1.0 - 04/20) ||");

        Triangle triangle = new Triangle();
        // Define base and height
        triangle.base = Lib.readDouble("Quelle est la base :");
        triangle.height = Lib.readDouble("Quelle est la hauteur :");

        System.out.printf("Aire est de %f", triangle.area());
    }
}