package com.kamotelabs.tutorial001;

public class Main2 {

    public static void main (String[] args) {
        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;

        long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
        System.out.println("longTotal = " + longTotal);

        short shortTotal = (short) (1000 * 10 * (byteValue + shortValue + intValue));
        System.out.println("shortTotal = " + shortTotal);
    }
}
