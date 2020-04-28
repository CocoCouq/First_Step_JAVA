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
            default:
                System.out.println("Pas d'exercice correspondant");
        }
    }
}
