package com.kamotelabs.tutorial001;

public class OperatorsChallenge {

    public static void main(String[] args) {
        double firstDouble = 20D;
        double secondDouble = 80D;

        double product = (firstDouble + secondDouble) * 25;

        double remainder = product % 40;

        System.out.println(remainder);

        if (remainder >= 20) {
            System.out.println("Total was over the limit.");
        }
    }
}
