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
        float myFloat = 5f; // explicitly set literal value to be processed ny Java as float
        double myDouble =5d; // explicitly set literal value to be processed by java as double
    }
}
