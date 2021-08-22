package com.github.cheshi_mantu.section5;

public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        System.out.println(getDaysInMonth(1, 2021));
        System.out.println(getDaysInMonth(2, 2021));
        System.out.println(getDaysInMonth(2, 2000));
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
    public static int getDaysInMonth(int month, int year){
        int daysInAmonth;
        if ((month < 1) ||  (month > 12) || (year < 1) || (year > 9999)){
            return -1;
        } else {
            switch (month){
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    daysInAmonth = 31;
                    break;
                case 2:
                    daysInAmonth = isLeapYear(year) ? 29 : 28;
                    break;
                case 4: case 6: case 9: case 11:
                    daysInAmonth = 30;
                    break;
                default:
                    daysInAmonth = -1;
                    break;
            }
            return daysInAmonth;
        }
    }
}
