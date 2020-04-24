package com.FirstJavaProject.Syntax;

import java.util.Scanner;

public class Syntax {
    // LIST
    public static int syntaxList() {
        Scanner READ = new Scanner(System.in);
        System.out.printf("||================================================||%n");
        System.out.printf("||   1 : Circle                                   ||%n");
        System.out.printf("||   2 : Swap                                     ||%n");
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
                Circle.circle();
                break;
            case 2:
                Swap.exec();
                break;
            default:
                System.out.println("Pas d'exercice correspondant");
        }
    }
}
