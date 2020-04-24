package com.FirstJavaProject.Tables;

import com.FirstJavaProject.Loops.*;

import java.util.Scanner;

public class Tables {

    // LIST
    public static int tablesList() {
        Scanner READ = new Scanner(System.in);
        System.out.printf("||================================================||%n");
        System.out.printf("||   1 : Insertion                                ||%n");
        System.out.printf("||   2 : Suppression                              ||%n");
        System.out.printf("||   3 : Bubble Sort                              ||%n");
        System.out.printf("||   4 : Insertion (Array List)                   ||%n");
        System.out.printf("||   5 : Suppression (Array List)                 ||%n");
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
                InsertTable.exec();
                break;
            case 2:
                DeleteValue.exec();
                break;
            case 3:
                BubbleSort.exec();
                break;
            case 4:
                InsertTableV2.exec();
                break;
            case 5:
                DeleteTableV2.exec();
                break;
            default:
                System.out.println("Pas d'exercice correspondant");
        }
    }
}
