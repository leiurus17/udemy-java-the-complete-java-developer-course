package com.kamotelabs.tutorial001;

public class Main {

    public static void main(String[] args) {

        // integer primitive variables
        // int has a width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647; // you can insert underscores for readability

        // byte primitive variables
        // byte has a width of 8
        byte myByteValue = 127;
        byte myNewByteValue = (byte) (myByteValue / 2);
        System.out.println("myNewByteValue = " + myNewByteValue);

        // short primitive variable
        short myShortValue = 32767;

        // long primitive variable
        // long has width of 64
        long myLongValue = 9_223_372_036_854_775_007L;


    }
}