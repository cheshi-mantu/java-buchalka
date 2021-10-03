package com.github.cheshi_mantu.section5;

public class LastDigitChecker {
    public static void main(String[] args) {

    }
    public static boolean isValid(int number){
        if (number > 1000 || number < 10) {
            return false;
        } else {
            return true;
        }
    }
    public static boolean hasSameLastDigit(int number1, int number2, int number3) {
        if (!isValid(number1) || !isValid(number2) || !isValid(number3)) {
            return false;
        } else {
            if ((number1 % 10 == number2 % 10) || (number1 % 10 == number3 % 10) || (number2 % 10 == number3 % 10)) {
                return true;
            } else {
                return false;
            }
        }
    }
}
