package com.perscholas.java_basics;

public class FifthExampleDivideTwoDoublesCast {

    //Variable declaration and assignment
    double a = 2.1;
    double b = 4.2;
    double quotient = b / a;

    //Method to print the quotient
    public void printDivideTwoDoublesCast() {
        System.out.println("Fifth Problem:");
        System.out.println("The quotient of " + b + " divided " + a + " is " + quotient + ".");

        int c = (int) quotient;

        System.out.println("If this quotient, stored as a double, is then cast to an int data type, the following results: " + c);

    }
}
