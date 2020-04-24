package com.FirstJavaProject.Conditions;

import com.FirstJavaProject.Lib;

public class Discount {
    // Price and Quantity
    public static double[] priceAndQuantity() {
        double[] tabRes = new double[2];

        tabRes[0] = Lib.readDouble("Prix d'un produit :");
        tabRes[1] = Lib.readDouble("Quantité de produits :");

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

    /* EXECUTE */
    public static void exec() {
        System.out.println("|| Remise                           (V1.1 - 04/20) ||");

        // Price and Quantity
        double[] tabPQ = priceAndQuantity();

        // Calculate
        double[] tabFinal = calcPrice(tabPQ[0], tabPQ[1]);

        // Result display
        System.out.printf("Prix Total : %f%nPort : %f%n", tabFinal[0], tabFinal[1]);
        System.out.printf("Remise : %f%nPrix a payer : %f%n", tabFinal[2], tabFinal[3]);
    }
}
