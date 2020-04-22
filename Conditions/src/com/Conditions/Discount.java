package com.Conditions;

import java.util.Scanner;

public class Discount {
    public static Scanner READ = new Scanner(System.in);

    // Price and Quantity
    public static double[] priceAndQuantity() {
        double[] tabRes = new double[2];

        System.out.println("Prix d'un produit :");
        tabRes[0] = READ.nextDouble();

        System.out.println("Quantité de produits :");
        tabRes[1] = READ.nextDouble();

        return tabRes;
    }

    // Return of total price, discount and postal charges, price to pay
    public static double[] calcPrice(double price, double quantity) {
        double[] tabRes = new double[4];

        // Total
        tabRes[0] = price * quantity;

        // Postal Charges
        tabRes[1] = tabRes[0] > 500 ? 0 : (tabRes[0] * 0.02);
        tabRes[1] = tabRes[1] < 6 ? 6 : tabRes[1];

        // Discount
        if (tabRes[0] >= 100) {
            if (tabRes[0] <= 200)
                tabRes[2] = tabRes[0] * 0.05;
            else
                tabRes[2] = tabRes[0] * 0.1;
        }
        else {
            tabRes[2] = 0;
        }

        // Price to pay
        tabRes[3] = tabRes[0] + tabRes[1] - tabRes[2];

        return tabRes;
    }

    // Display
    public static void displayValue(String message, double number) {
        System.out.print(message);
        System.out.println(number);
    }

    // MAIN
    public static void main(String[] args) {
        System.out.println("**** Remise (V1.0 - 04/20) ****");

        // Price and Quantity
        double[] tabPQ = priceAndQuantity();

        // Calculate
        double[] tabFinal = calcPrice(tabPQ[0], tabPQ[1]);

        // Result display
        displayValue("Prix Total :", tabFinal[0]);
        displayValue("Ports :", tabFinal[1]);
        displayValue("Remise :", tabFinal[2]);
        displayValue("Prix à payer :", tabFinal[3]);
    }
}
