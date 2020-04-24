package com.FirstJavaProject.Loops;

import java.util.Scanner;

public class Loops {
    // LIST
    public static int loopsList() {
        Scanner READ = new Scanner(System.in);
        System.out.printf("||================================================||%n");
        System.out.printf("||   1 : Inférieur à N                            ||%n");
        System.out.printf("||   2 : Somme des entiers inférieurs             ||%n");
        System.out.printf("||   3 : Somme Intervalle                         ||%n");
        System.out.printf("||   4 : Moyenne                                  ||%n");
        System.out.printf("||   5 : Min et Max                               ||%n");
        System.out.printf("||   6 : N multiples de X                         ||%n");
        System.out.printf("||   7 : Voyelles                                 ||%n");
        System.out.printf("||   8 : Tranche d'age                            ||%n");
        System.out.printf("||   9 : Nombres premiers                         ||%n");
        System.out.printf("||  10 : Nombre Magic                             ||%n");
        System.out.printf("||  11 : Triangle                                 ||%n");
        System.out.printf("||  12 : Palindrome                               ||%n");
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
                InferiorInt.exec();
                break;
            case 2:
                SumInferior.exec();
                break;
            case 3:
                IntervalSum.exec();
                break;
            case 4:
                Average.exec();
                break;
            case 5:
                MinAndMax.exec();
                break;
            case 6:
                Multiples.exec();
                break;
            case 7:
                Vowels.exec();
                break;
            case 8:
                Age.exec();
                break;
            case 9:
                IsPrime.exec();
                break;
            case 10:
                MagicNumber.exec();
                break;
            case 11:
                Triangle.exec();
                break;
            case 12:
                Palindrome.exec();
                break;
            default:
                System.out.println("Pas d'exercice correspondant");
        }
    }
}
