package com.github.cheshi_mantu.section5;

public class FirstLastDigitsSum {
    public static void main(String[] args) {
        System.out.println("Sum of the first and last digits is " + sumFirstAndLastDigit(111));
        System.out.println("Sum of the first and last digits is " + sumFirstAndLastDigit(212));
        System.out.println("Sum of the first and last digits is " + sumFirstAndLastDigit(12));
        System.out.println("Sum of the first and last digits is " + sumFirstAndLastDigit(10));
    }
    public static int sumFirstAndLastDigit(int number){
        int testNumber;
        int lastDigit = 0;
        int firstDigit = 0;

        if (number < 0) {
            return -1;
        } else {
            testNumber = number;
        }

        lastDigit =  testNumber % 10;

        while (testNumber > 0) {
            firstDigit = testNumber % 10;
            testNumber /= 10;
            System.out.println("Number is " + testNumber);
        }
        return firstDigit + lastDigit;
    }

}
