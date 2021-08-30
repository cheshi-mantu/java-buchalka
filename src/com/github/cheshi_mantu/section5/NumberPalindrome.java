package com.github.cheshi_mantu.section5;

public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-222));



    }

    public static boolean isPalindrome(int number) {
        if (number < 0) {
            number = -number;
        }

        int testNumber = number;
        int reverse = 0;
        int factor = 10;

        while (testNumber > 0) {
            reverse *= factor;
            reverse =  reverse + testNumber % factor;
            testNumber /=factor;
            System.out.println("Number is " + number);
            System.out.println("reverse is " + reverse);
        }
        if (number == reverse) {
            return true;
        } else {
            return false;
        }

    }
}
