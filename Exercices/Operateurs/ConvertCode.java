import java.util.*;

public class ConvertCode {
    final static Scanner READ = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("**** Convertir un int en char (V1.0 - 04/20) ****");

        // Read ASCII code and convert to char
        char c = (char) READ.nextInt();

        System.out.println(c);
    }
}