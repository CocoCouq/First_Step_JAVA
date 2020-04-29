package com.FirstJavaProject.ObjectSup;

public class MakeTriangles {
    public static void exec() {
        // Create triangle
        Triangle T  = new Triangle();
        // On start, the triangle was null
        T.afficher();
        // Create the 3 points of the triangle
        T.creer();
        // Display result : Position of the 3 points
        T.afficher();
        // Move the triangle on x (+100)
        T.deplacer(100, 0);
        // Display new position
        T.afficher();
    }
}
