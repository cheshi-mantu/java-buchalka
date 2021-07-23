package com.github.cheshi_mantu;

public class FloatAndDouble {
    public static void main(String[] args) {
        
        float floatTypeMax = Float.MAX_VALUE;
        float floatTypeMin = Float.MIN_VALUE;

        System.out.println("Max float: " + floatTypeMax);
        System.out.println("Min float: " + floatTypeMin);

        double doubleTypeMax = Double.MAX_VALUE;
        double doubleTypeMin = Double.MIN_VALUE;

        System.out.println("Max double: " + doubleTypeMax);
        System.out.println("Min double: " + doubleTypeMin);

        int myInt = 5;
        float myFloat = 5.25f; // explicitly set literal value to be processed ny Java as float
        float myFloatAgain = (float) 5.25; // explicitly set float value to be processed ny Java as float using casting
        double myDouble =5.27d; // explicitly set literal value to be processed by java as double

        System.out.println("Casting float to float " + (float) (myFloat*2));
    }
}
