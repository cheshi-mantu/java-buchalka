package com.github.cheshi_mantu.section5;

public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(9,12));
        System.out.println(hasSharedDigit(19,100));
        System.out.println(hasSharedDigit(22,44));

    }
    public static boolean hasSharedDigit (int number1, int number2){
        if (((number1 < 10) || (number1 > 99) ) || ((number2 < 10) || (number2 > 99) )){
            return false;
        } else {
            return true;
        }


    }
}
