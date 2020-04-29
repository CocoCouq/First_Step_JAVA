package com.FirstJavaProject.Objects;

import com.FirstJavaProject.Loops.*;

import java.util.Scanner;

public class Objects {
    // LIST
    public static int objectsList() {
        Scanner READ = new Scanner(System.in);
        System.out.printf("||================================================||%n");
        System.out.printf("||   1 : Cercles de 10 et 45                      ||%n");
        System.out.printf("||   2 : Tri de Tableaux                          ||%n");
        System.out.printf("||   3 : Formes Géométriques                      ||%n");
        System.out.printf("||   4 : Véhicules                                ||%n");
        System.out.printf("||   5 : Client (Affichage du tableau)            ||%n");
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
                CallCircles.exec();
                break;
            case 2:
                CallSortTable.exec();
                break;
            case 3:
                CallShape.exec();
                break;
            case 4:
                CallVehicles.exec();
                break;
            case 5:
                CallClient.exec();
                break;
            default:
                System.out.println("Pas d'exercice correspondant");
        }
    }
}
