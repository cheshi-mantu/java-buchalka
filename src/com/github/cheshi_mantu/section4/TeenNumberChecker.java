package com.github.cheshi_mantu.section4;

public class TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
    }

    public static boolean hasTeen(int one, int two, int three) {
        if (isTeen(one)) {
            return true;
        } else if(isTeen(two)) {
            return true;
        } else if(isTeen(three)) {
            return true;
        } else {
            return false;
        }

    }
    public static boolean isTeen(int someNumber){
        int rangeLow = 13;
        int rangeHigh = 19;

        if ((someNumber >= rangeLow) && (someNumber <= rangeHigh)) {
            return true;
        } else {
            return false;
        }

    }

}
