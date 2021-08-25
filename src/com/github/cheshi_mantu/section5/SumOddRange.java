package com.github.cheshi_mantu.section5;

public class SumOddRange {
    public static void main(String[] args) {

//        for (int i = -1; i < 10; i++) {
//            String str = "";
//            if (isOdd(i)) {
//                str = " is ";
//            } else {
//                str = " isn't ";
//            }
//            System.out.println(i + str + "odd");
//        }
        System.out.println( sumOdd(1, 11));
        System.out.println( sumOdd(-4, 6));
    }

    public static boolean isOdd(int numberToCheck) {
        if ((numberToCheck > 0) && (numberToCheck % 2 > 0)) {
                return true;
        } else {
                return false;
            }
    }

    public static int sumOdd(int startVal, int stopVal) {
        int oddNumbersSum = 0;
        if ((startVal <= stopVal) && (startVal > 0 ) && (stopVal >0)) {
            for (int i = startVal; i <= stopVal; i++) {
                if (isOdd(i)) {
                    oddNumbersSum += i;
                }
            }
            return oddNumbersSum;
        } else {
            return -1;
        }
    }
}
