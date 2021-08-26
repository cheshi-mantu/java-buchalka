package com.github.cheshi_mantu.section5;

public class SumAllDigits {
    public static void main(String[] args) {
        System.out.println(sumDigits(123));
    }
    private static int sumDigits(int number) {
        int sumAllDigits = 0;
        if (number > 10) {
            while (number > 10) {
                sumAllDigits += (int) number % 10;
                number = (int) number/10;
            }
            sumAllDigits += number;
            return sumAllDigits;
        } else {
            return -1;
        }
    }
}
