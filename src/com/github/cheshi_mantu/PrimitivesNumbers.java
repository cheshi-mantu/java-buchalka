package com.github.cheshi_mantu;

public class PrimitivesNumbers {
    public static void main(String[] args) {
        int myInt = 10000;
        int myMinInt = Integer.MIN_VALUE;
        int myMaxInt = Integer.MAX_VALUE;

        System.out.println("Min for integer: " + myMinInt);
        System.out.println("Max for integer: " + myMaxInt);

        System.out.println("Integer is a wrapper class for primitive data type Integer");

        System.out.println("Error will be here : " + (myMaxInt + 1));

        int mytMaxINteger = 2_147_483_647;

        byte myMinByte = Byte.MIN_VALUE;
        byte myMaxByte = Byte.MAX_VALUE;

        System.out.println("Min for byte: " + myMinByte);
        System.out.println("Max for byte: " + myMaxByte);

        short myMinShort = Short.MIN_VALUE;
        short myMaxShort = Short.MAX_VALUE;

        System.out.println("Min for short: " + myMinShort);
        System.out.println("Max for short: " + myMaxShort);


        long myMinLong = Long.MIN_VALUE;
        long myMaxLong = Long.MAX_VALUE;

        System.out.println("Min for Long: " + myMinLong);
        System.out.println("Max for Long: " + myMaxLong);




    }
}
