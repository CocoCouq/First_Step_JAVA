import java.util.Scanner;

public class SwitchValue
{
    // Scanner
    final static Scanner READ = new Scanner(System.in);

    // Define one number
    public static double defineNumber(String message)
    {
        System.out.println(message);
        double number = READ.nextDouble();
        return number;
    }

    // Display number
    public static void displayNumber(double number, String message)
    {
        System.out.print(message);
        System.out.println(number);
    }

    // MAIN
    public static void main(String[]args)
    {
        System.out.println("**** Swap (V1.0 - 04/20) ****");

        double nY = defineNumber("nY: ");
        double nX = defineNumber("nX: ");

        // swap values
        double temp = nY;
        nY = nX;
        nX = temp;

        displayNumber(nY, "nY: ");
        displayNumber(nX, "nX: ");
    }

}