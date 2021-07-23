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
        float myFloatAgain = (float) 5.25; // explicitly set float value to be processed ny Java as float using casting
        double myDouble =5d; // explicitly set literal value to be processed by java as double

        System.out.println("Casting float to float " + (float) (myFloat*2));

        System.out.println("MyInt " + myInt);
        System.out.println("MyFloat " + myFloat);
        System.out.println("MyDouble " + myDouble);

        System.out.println("MyInt divided by 2 " + myInt/2);
        System.out.println("MyFloat divided by 2 " + myFloat/2f);
        System.out.println("MyDouble divided by 2 " + myDouble/2d);

        System.out.println("MyInt divided by 3 " + myInt/3);
        System.out.println("MyFloat divided by 3 " + myFloat/3f);
        System.out.println("MyDouble divided by 3 look at the precision " + myDouble/3d);

        //challenge

        final double POUND_TO_KG = 0.45359237;

        double weightInPounds = 2.1;
        double weightInKilograms = weightInPounds * POUND_TO_KG;

        System.out.println("Weight in kilograms is " + weightInKilograms);



    }
}
