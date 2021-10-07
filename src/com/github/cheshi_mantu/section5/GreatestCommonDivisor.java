package com.github.cheshi_mantu.section5;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(11,11));
        System.out.println(getGreatestCommonDivisor(11,22));
        System.out.println(getGreatestCommonDivisor(30,50));
        System.out.println(getGreatestCommonDivisor(25,15));
        System.out.println(getGreatestCommonDivisor(12,30));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        int min;
        int maxDivisor = -1;
        if ((first < 10) || (second < 10)) {
            return -1;
        } else {
            min = Math.min(first, second);
//            System.out.println("Min is " + min);
            for (int i = 1; i <= min; i++) {
                if ((first  % i == 0) && (second % i == 0)){
                    maxDivisor = i;
                }
            }
        }
        return maxDivisor;
    }
}
