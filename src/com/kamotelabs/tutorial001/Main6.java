package com.kamotelabs.tutorial001;

public class Main6 {

    public static void main(String[] args) {
        // Operators
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;

        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;

        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;

        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        result = result + 1;
        System.out.println("Result is now " + result);

        result++;
        System.out.println("Result is now " + result);

        result += 2;
        System.out.println("Result is now " + result);

        result *= 10;
        System.out.println("Result is now " + result);

        result -= 10;
        System.out.println("Result is now " + result);

        result /= 10;
        System.out.println("Result is now " + result);

        boolean isAlien = false;

        if (isAlien == false)
            System.out.println("It is not an alien.");

        int topScore = 99;
        if (topScore < 100)
            System.out.println("You did not got the high score!");

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100))
            System.out.println("Greater than second top score and less than 100");

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("One of these test is true.");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("Yes, the newValue is " + newValue);
        }

        boolean isCar = false;
        if (isCar) {
            System.out.println("This is not supposed to happen.");
        }
    }
}
