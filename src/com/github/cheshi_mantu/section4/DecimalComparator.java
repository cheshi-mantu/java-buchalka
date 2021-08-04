package com.github.cheshi_mantu.section4;

public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }

    public static boolean areEqualByThreeDecimalPlaces(double paramOne, double paramTwo){
        paramOne = (int) (paramOne * 1000);
        paramTwo = (int) (paramTwo * 1000);
//        System.out.println(paramOne + " vs. " + paramTwo);
        if (paramOne == paramTwo) {
            return true;
        } else {
            return false;
        }
    }
}
