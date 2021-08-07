package com.github.cheshi_mantu.section4;

public class EqualSumChecker {
    public static void main(String[] args) {
        System.out.println(hasEqualSum(1,1,2));
        System.out.println(hasEqualSum(2,-2,0));
        System.out.println(hasEqualSum(1,2,3));
        System.out.println(hasEqualSum(2,2,5));

    }
    public static boolean hasEqualSum(int one, int two, int expectedResult){
        if (one + two == expectedResult) {
            return true;
        } else {
            return false;
        }
    }

}
