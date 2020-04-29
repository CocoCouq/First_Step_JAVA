package com.FirstJavaProject.ObjectSup;

import com.FirstJavaProject.Lib;

import javax.sound.midi.SoundbankResource;
import java.util.Scanner;

public class Biblio {
    final static Scanner scanner = new Scanner(System.in);

    public static String readString(String message) {
        System.out.println(message);
        return scanner.nextLine();
    }

    public static int readInt(String message) {
        System.out.println(message);
        return scanner.nextInt();
    }

    private static void choiceDisplay(char choice, PocketBook pock) {
        switch (choice) {
            case 'o':
                pock.displayBook();
                break;
            case 'n':
                System.out.println("Le résultat n'a pas été affiché");
                break;
            default:
                System.out.println("Nous n'avons pas compris");
                break;
        }
    }

    /* EXECUTE */
    public static void exec() {
        System.out.println("|| BIBLIOTHEQUE                    (V1.1 - 04/20) ||");

        char choice;
        // New pocket book
        PocketBook pock = new PocketBook(
                readString("Titre:"),
                readString("Nom :"),
                readString("Prenom :"),
                readString("Categorie :"),
                readInt("ISBN:")
        );
        choice = Lib.readChar("Souhaitez vous voir le résultat ? (o/n)");
        choiceDisplay(choice, pock);
        // Define code
        pock.calcCode();
        choice = Lib.readChar("Souhaitez vous voir le résultat ? (o/n)");
        choiceDisplay(choice, pock);
        // Display code
        choice = Lib.readChar("Souhaitez vous voir le code du livre ? (o/n)");
        switch (choice) {
            case 'o':
                pock.showCode();
                break;
            case 'n':
                System.out.println("Pas d'affichage du code");
                break;
            default:
                System.out.println("Erreur de saisie");
        }
    }

}