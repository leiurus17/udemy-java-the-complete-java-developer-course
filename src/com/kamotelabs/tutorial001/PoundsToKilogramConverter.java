package com.kamotelabs.tutorial001;

/*
    Convert a given number of pounds to kilogram
    1. Create a variable to store the number of pounds
    2. Calculate the number of Kilograms for the above and store in a variable
    3. Print out the result
 */

import java.util.Scanner;

public class PoundsToKilogramConverter {

    private final static double POUNDS_TO_KILOGRAM_CONVERT_VALUE = 0.45359237;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the value in pounds: ");
        double pounds = scan.nextDouble();

        double kilograms = pounds * POUNDS_TO_KILOGRAM_CONVERT_VALUE;

        System.out.println("The value of " + pounds + " lb to kilograms is " + kilograms + "kg");
    }
}
