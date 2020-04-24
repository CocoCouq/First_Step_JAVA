package com.FirstJavaProject.Conditions;

import java.util.Scanner;

public class Conditions {

    // LIST
    public static int conditionsList() {
        Scanner READ = new Scanner(System.in);
        System.out.printf("||================================================||%n");
        System.out.printf("||   1 : Parité                                   ||%n");
        System.out.printf("||   2 : Age                                      ||%n");
        System.out.printf("||   3 : Calculette                               ||%n");
        System.out.printf("||   4 : Remise                                   ||%n");
        System.out.printf("||   5 : Participation                            ||%n");
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
                EvenNumber.exec();
                break;
            case 2:
                Age.exec();
                break;
            case 3:
                Calculator.exec();
                break;
            case 4:
                Discount.exec();
                break;
            case 5:
                Contributions.exec();
                break;
            default:
                System.out.println("Pas d'exercice correspondant");
        }
    }
}
