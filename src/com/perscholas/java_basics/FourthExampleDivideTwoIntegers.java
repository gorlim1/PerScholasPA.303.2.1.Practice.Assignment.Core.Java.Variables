package com.perscholas.java_basics;

public class FourthExampleDivideTwoIntegers {

    //Variable declaration and assignment
    int a = 4;
    int b = 8;
    int quotient = b / a;

    //Method to print the quotient
    public void printIntegerDivision() {
        System.out.println("Fourth Problem:");
        System.out.println("The quotient of " + b + " divided by " + a + " is " + quotient + ".");
        System.out.println("Changing 8 to 8.0, IntelliJ declares an int was required but a double was provided.");
        System.out.println("To fix it, the variables storing 8.0 and the quotient were changed from the int to the " +
                "double data type.");

        double c = 8.0;
        double quotient = c / a;

        System.out.println("The quotient of " + c + " divided by " + a + " is " + quotient + ".");
    }


}
