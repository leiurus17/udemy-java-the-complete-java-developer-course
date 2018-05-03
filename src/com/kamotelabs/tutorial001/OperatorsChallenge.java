package com.kamotelabs.tutorial001;

public class OperatorsChallenge {

    public static void main(String[] args) {
        double firstDouble = 20L;
        double secondDouble = 80L;

        double product = (firstDouble + secondDouble) * 25;

        double remainder = product % 40;

        if (remainder >= 20) {
            System.out.println("Total was over the limit.");
        }
    }
}
