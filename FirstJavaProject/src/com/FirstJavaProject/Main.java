package com.FirstJavaProject;

import com.FirstJavaProject.Conditions.Conditions;
import com.FirstJavaProject.Functions.Functions;
import com.FirstJavaProject.Loops.Loops;
import com.FirstJavaProject.Operators.Operators;
import com.FirstJavaProject.Syntax.Syntax;
import com.FirstJavaProject.Tables.Tables;

public class Main {

    public static void main(String[] args) {
        // Load head
        MainComponents.header();
        int category = Lib.readInt("||  Saisissez la catégorie : (numéro du sommaire) ||");
        int exercise;

        switch (category) {
            case 1 :
                exercise = Syntax.syntaxList();
                Syntax.exec(exercise);
                break;
            case 2 :
                exercise = Operators.operatorsList();
                Operators.exec(exercise);
                break;
            case 3:
                exercise = Conditions.conditionsList();
                Conditions.exec(exercise);
                break;
            case 4:
                exercise = Loops.loopsList();
                Loops.exec(exercise);
                break;
            case 5:
                exercise = Tables.tablesList();
                Tables.exec(exercise);
                break;
            case 6:
                exercise = Functions.functionsList();
                Functions.exec(exercise);
            default:
                System.out.println("Pas de catégory correspondante");
        }

    }
}
