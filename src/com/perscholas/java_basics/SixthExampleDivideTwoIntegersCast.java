package com.perscholas.java_basics;

public class SixthExampleDivideTwoIntegersCast {

    //Variable declaration and assignment
    int x = 5;
    int y = 6;
    int q = y / x;

    //Method to print the quotient
    public void printDivideTwoIntegersCast() {
        System.out.println("Sixth Problem:");
        System.out.println("The quotient of " + y + " divided by " + x + " is " + q + ".");

        double q = (double) y;

        System.out.println("If " + y + " is then cast to a double from an int data type, and assigned to the variable " +
                "storing the quotient after also making it a double,");
        System.out.println("the value of the " + "quotient" + " becomes " + q + ".");
    }
}
