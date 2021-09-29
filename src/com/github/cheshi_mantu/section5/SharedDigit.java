package com.github.cheshi_mantu.section5;

public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(9, 12));
        System.out.println(hasSharedDigit(19, 999));


        System.out.println(hasSharedDigit(22, 44));

        System.out.println(hasSharedDigit(11, 51));


        System.out.println(hasSharedDigit(22, 21));
        System.out.println(hasSharedDigit(21, 12));

    }

    public static boolean hasSharedDigit(int number1, int number2) {
        if ((number1 < 10) || (number1 > 99) || (number2 < 10) || (number2 > 99)) {
            return false;
        } else {
            if ((number1 / 10 == number2 / 10) || (number1 / 10 == number2 % 10) || (number1 % 10 == number2 / 10) || (number1 % 10 == number2 % 10)) {
                return true;
            } else {
                return false;
            }
        }
    }
}
