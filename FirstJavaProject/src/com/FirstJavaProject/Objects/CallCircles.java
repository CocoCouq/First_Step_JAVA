package com.FirstJavaProject.Objects;

public class CallCircles {
    /* EXECUTE */
    public static void exec() {
        System.out.println("|| Cercles de 10 et 45            (V1.0 - 04/20) ||");

        Circles circle1 = new Circles(10);
        Circles circle2 = new Circles(45);

        // Results
        System.out.println("Cercle de 10cm de rayon :");
        System.out.printf("Surface: %f -- Ciconférence: %f%n", circle1.surface(), circle1.circum());

        System.out.println("Cercle de 45cm de rayon :");
        System.out.printf("Surface: %f -- Ciconférence: %f%n", circle2.surface(), circle2.circum());
    }
}
