package com.github.cheshi_mantu.section4;

public class ToCentimeters {
    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(1,1));
        System.out.println(calcFeetAndInchesToCentimeters(1));
        System.out.println(calcFeetAndInchesToCentimeters(10));
        System.out.println(calcFeetAndInchesToCentimeters(12));
        System.out.println(calcFeetAndInchesToCentimeters(22));
        System.out.println(calcFeetAndInchesToCentimeters(24));
    }

    public static double calcFeetAndInchesToCentimeters(int feet, int inches){
        double inch = 2.54;
        double foot = 12 * inch;
        double centimeters;

        if (feet < 0 ) {
            return -1;
        } else {
            if (inches < 0 || inches > 12 ) {
                return -1;
            } else {
                centimeters = feet * foot + inches * inch;
                return centimeters;
            }
        }
    }

    public static double calcFeetAndInchesToCentimeters(int inches){
        double centimeters;

            if (inches < 0 ) {
                return -1;
            } else {
                centimeters = calcFeetAndInchesToCentimeters(inches/12, inches % 12);
                return centimeters;
            }
        }
}
