import java.util.*;

public class ConvertSeconds {
    final static Scanner READ = new Scanner(System.in);

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


    // MAIN
    public static void main(String[] args) {
        System.out.println("**** Secondes en Date (V1.0 - 04/20) ****");

        System.out.println("Nombre de secondes :");
        long sec = READ.nextLong();

        // Convert
        final String result = convertSeconds(sec);

        // Display result
        System.out.println("Heure :");
        System.out.println(result);
    }
}