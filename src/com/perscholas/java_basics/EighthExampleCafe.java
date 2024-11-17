package com.perscholas.java_basics;

public class EighthExampleCafe {

    //Variable declaration and assignment
    String product1 = "Grilled Cheese";
    String product2 = "Croissant";
    String product3 = "Creme Brulee";
    double product1Price = 5.99;
    double product2Price = 4.99;
    double product3Price = 8.99;
    double subtotal;
    final double SALES_TAX = 0.08875;
    double totalSale;

    //Method to print the cafe order's details
    public void printCafeOrder() {
        System.out.println("Eighth Problem:");
        System.out.println("Adela orders three " + product1 + "s, four " + product2 + "s, and two " + product3 + "s" +
                " from the Krunchkin Cafe.");

        subtotal = 3 * product1Price + 4 * product2Price + 2 * product3Price;
        totalSale = subtotal + subtotal * SALES_TAX;

        System.out.printf("Her subtotal is $%.2f, and so the total is $%.2f including 8.8875%% sales tax."
                , subtotal, totalSale);
    }
}
