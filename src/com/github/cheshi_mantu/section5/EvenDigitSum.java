package com.github.cheshi_mantu.section5;

public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println("Sum of even digits is " + getEvenDigitSum(123));
        System.out.println("Sum of even digits is " + getEvenDigitSum(123456789));
        System.out.println("Sum of even digits is " + getEvenDigitSum(2222));
        System.out.println("Sum of even digits is " + getEvenDigitSum(223344556));
        System.out.println("Sum of even digits is " + getEvenDigitSum(252));
    }
    public static int getEvenDigitSum(int number) {
        int sum = 0;
        int currentNumber = number;
        int remainder = 0;
        if (number < 0 ) {
            return -1;
        } else {
            while(currentNumber > 0) {
                remainder = currentNumber % 10;
                currentNumber /= 10;
                if (remainder %2 == 0) {
                    sum += remainder;
                }
            }
        }
        return sum;
    }
}
