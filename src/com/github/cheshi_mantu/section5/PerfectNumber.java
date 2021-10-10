package com.github.cheshi_mantu.section5;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(4));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(7));
        System.out.println(isPerfectNumber(8));
        System.out.println(isPerfectNumber(9));
        System.out.println(isPerfectNumber(10));

    }
    public static boolean isPerfectNumber(int number){
        if (number < 1) {
            return false;
        } else {
            int sumOfDivisors = 0;
            for (int i = 1;i < number; i++) {
                if (number % i == 0) {
                    sumOfDivisors += i;
//                    System.out.println("Interim sum of divisors for " + number + " is " + sumOfDivisors);
                }
            }
//            System.out.println(sumOfDivisors);
            if (sumOfDivisors == number) {
                return true;
            } else {
                return false;
            }
        }
    }
}
