package com.github.cheshi_mantu.section4;

public class SpeedConverter {
    public static void main(String[] args) {
        printConversion(1.5); // 1
        printConversion(10.25); // 6
        printConversion(-5.6); // -1
        printConversion(25.42); //16
        printConversion(75.114); // 47
        printConversion(95.75); // 60
    }
    public static long toMilesPerHour(double kilometersPerHour) {
        final double toMilesPerHourFactor = 1.609;
        long milesPerHour;

        if (kilometersPerHour < 0) {
            return -1;
        } else {
            milesPerHour = Math.round((kilometersPerHour / toMilesPerHourFactor));
            return milesPerHour;
        }
    }
    public static void printConversion(double kilometersPerHour){
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        }
        else {
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        }

    }

}
