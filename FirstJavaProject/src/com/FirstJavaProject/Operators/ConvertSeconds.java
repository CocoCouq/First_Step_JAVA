package com.FirstJavaProject.Operators;

import com.FirstJavaProject.Lib;

public class ConvertSeconds {
    // Convert Seconds
    public static String convertSeconds(long sec) {
        long min = sec / 60;
        sec = sec % 60;
        long hou = min / 60;
        min = min % 60;

        final String seconds = Long.toString(sec);
        final String minutes = Long.toString(min);
        final String hours = Long.toString(hou);

        return hours+":"+minutes+":"+seconds;
    }

    /* EXECUTE */
    public static void exec() {
        System.out.println("|| Secondes en date               (V1.1 - 04/20) ||");

        long sec = Lib.readLong("Nombre de secondes :");

        // Result
        System.out.printf("Heure : %s", convertSeconds(sec));
    }
}
