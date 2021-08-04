package com.github.cheshi_mantu.section4;

public class LeapYear {
    public static void main(String[] args) {

        System.out.println(isLeapYear(1800));
        System.out.println(isLeapYear(1978));
        System.out.println(isLeapYear(2004));
        System.out.println(isLeapYear(1924));
        System.out.println(isLeapYear(2008));

    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else {
            if ((year % 4 == 0) && (year % 100 > 0)) {
                return true;
            } else if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)) {
                return true;
            } else {
                return false;
            }

        }
    }
}