package com.Operateurs;

import java.util.Scanner;

public class Average {
    final static Scanner READ = new Scanner(System.in);

    // Read
    public static float readNumber(String message) {
        System.out.println(message);
        float number = READ.nextFloat();
        return number;
    }

    // Average
    public static float average(float[] tabNotes) {
        float sum = 0;
        int i = -1;

        while (++i < tabNotes.length)
            sum += tabNotes[i];

        return sum / tabNotes.length;
    }

    // MAIN
    public static void main(String[] args) {
        System.out.println("**** Moyenne - 3notes (V1.0 - 04/20) ****");

        // Notes
        float[] notes = new float[3];
        notes[0] = readNumber("Resultat du devoir à la Maison :");
        notes[1] = readNumber("Resultat du devoir écrit :");
        notes[2] = readNumber("Resultat du devoir oral :");

        // Average
        float avg = average(notes);

        System.out.println("Moyenne :");
        System.out.println(avg);
    }
}
