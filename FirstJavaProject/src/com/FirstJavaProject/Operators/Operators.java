package com.FirstJavaProject.Operators;

import java.util.Scanner;

public class Operators {
    // LIST
    public static int operatorsList() {
        Scanner READ = new Scanner(System.in);
        System.out.printf("||================================================||%n");
        System.out.printf("||   1 : Additionneur                             ||%n");
        System.out.printf("||   2 : Diviseur                                 ||%n");
        System.out.printf("||   3 : Fahrenheit                               ||%n");
        System.out.printf("||   4 : Moyenne                                  ||%n");
        System.out.printf("||   5 : Conversion secondes                      ||%n");
        System.out.printf("||   6 : ASCII code                               ||%n");
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
                Add.exec();
                break;
            case 2:
                Div.exec();
                break;
            case 3:
                Fahrenheit.exec();
                break;
            case 4:
                Average.exec();
                break;
            case 5:
                ConvertSeconds.exec();
                break;
            case 6:
                ConvertCode.exec();
                break;
            default:
                System.out.println("Pas d'exercice correspondant");
        }
    }
}
