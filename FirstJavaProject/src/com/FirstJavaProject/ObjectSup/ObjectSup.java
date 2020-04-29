package com.FirstJavaProject.ObjectSup;

import java.util.Scanner;

public class ObjectSup {
    // LIST
    public static int objectsSupList() {
        Scanner READ = new Scanner(System.in);
        System.out.printf("||================================================||%n");
        System.out.printf("||   1 : Livre de poche                           ||%n");
        System.out.printf("||   2 : Triangle                                 ||%n");
        System.out.printf("||________________________________________________||%n");
        System.out.printf("||                                                ||%n");
        System.out.printf("||          QUEL EXERCICE SOUHAITEZ VOUS ?        ||%n");
        System.out.printf("||________________________________________________||%n");
        int exercise = READ.nextInt();
        return exercise;
    }

    // EXEC
    public static void exec(int exercise) {
        switch (exercise) {
            case 1:
                Biblio.exec();
                break;
            case 2:
                MakeTriangles.exec();
                break;
            default:
                System.out.println("Pas d'exercice correspondant");
        }
    }
}
