package com.perscholas.java_basics;

public class SeventhExampleConstantCalculation {

    //Variable declaration and assignment
    final double GRAVITY = 9.81;
    double time = 5.0;
    double velocity = GRAVITY * time;

    //Method to print the constant calculation
    public void printGravityFreeFallVelocity() {
        System.out.println("Seventh Problem:");
        System.out.println("After falling 5.0 seconds from a stationary position, the velocity of an object in low " +
                "Earth altitude is " + velocity + ".");
    }
}
