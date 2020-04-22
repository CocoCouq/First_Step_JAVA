import java.util.*;

public class Fahrenheit {
    final static Scanner READ = new Scanner(System.in);

    // Convert in Fahrenheit
    public static double convertFahr(double fahr) {
        return ((fahr - 32) * 5) / 9;
    }

    // MAIN
    public static void main(String[] args) {
        System.out.println("**** Fahrenheit (V1.0 - 04/20) ****");

        // Read Fahrenheit
        System.out.println("Quelle est la température Fahrenheit ?");
        double fahr = READ.nextDouble();

        // Convert in Celsius
        double celsius = convertFahr(fahr);

        System.out.println("En Celsius: ");
        System.out.println(celsius);
    }
}