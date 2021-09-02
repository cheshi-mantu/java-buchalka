package com.github.cheshi_mantu.section5;

public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println("Sum of even digits is " + getEvenDigitSum(123));
        System.out.println("Sum of even digits is " + getEvenDigitSum(123456789));
        System.out.println("Sum of even digits is " + getEvenDigitSum(2222));
        System.out.println("Sum of even digits is " + getEvenDigitSum(223344556));
    }
    public static int getEvenDigitSum(int number) {
        int position = 0;
        int sum = 0;
        int currentNumber = number;
        int remainder = 0;
        if (number < 0 ) {
            return -1;
        } else {
            while(currentNumber > 0) {
                position++;
                remainder = currentNumber % 10;
                currentNumber /= 10;
                if (position %2 == 0) {
                    sum += remainder;
                }
            }
        }
        return sum;
    }
}
