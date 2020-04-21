import java.util.*;

public class Circle
{
    final static double PI=3.1416;

    // Rayon
    public static double rayon()
    {
        System.out.println("Entrer le rayon: ");
        Scanner readEntry = new Scanner(System.in);

        return readEntry.nextDouble() ;
    }

    // Circonférence
    public static double circon(double rayon)
    {
        return 2 * PI * rayon;
    }

    // Surface
    public static double surface(double rayon)
    {
        return PI * Math.pow(rayon, 2);
    }

    // Affichage
    public static void affiche(double circ, double surf)
    {
        // Affichage
        System.out.print("La circonférence est de: ");
        System.out.println(circ);
        System.out.print("La surface est de: ");
        System.out.println(surf);
    }

///////////////////////////////////////////////////////////////////////////////////////////

    // MAIN
    public static void main(String[] args)
    {
        System.out.println("**** Circonférence et surface du Cercle (V1.0 - 04/20) ****");

        // Rayon
        double rayon = rayon();

        // Perimetre
        double circ = circon(rayon);

        // Surface
        double surf = surface(rayon);

        // Affichage
        affiche(circ, surf);

    }
}