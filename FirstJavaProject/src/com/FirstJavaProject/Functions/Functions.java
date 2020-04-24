package com.FirstJavaProject.Functions;

import com.FirstJavaProject.Tables.*;

import java.util.Scanner;

public class Functions {

    // LIST
    public static int functionsList() {
        Scanner READ = new Scanner(System.in);
        System.out.printf("||================================================||%n");
        System.out.printf("||   1 : Concatenation                            ||%n");
        System.out.printf("||   2 : Compteur de mots                         ||%n");
        System.out.printf("||   3 : Fibonacci                                ||%n");
        System.out.printf("||   4 : Table de multiplication                  ||%n");
        System.out.printf("||   5 : Compteur de lettres                      ||%n");
        System.out.printf("||   6 : String Token                             ||%n");
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
                Concat.exec();
                break;
            case 2:
                CountWord.exec();
                break;
            case 3:
                Fibonacci.exec();
                break;
            case 4:
                MultiTable.exec();
                break;
            case 5:
                CountLetters.exec();
                break;
            case 6:
                StrToken.exec();
                break;
            default:
                System.out.println("Pas d'exercice correspondant");
        }
    }
}
