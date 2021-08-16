package com.github.cheshi_mantu.section4;

public class MinutesToYearsDaysCalculator {
    private final static String INV_VALUE = "Invalid Value";
    private final static int MINS_IN_HOUR = 60;
    private final static int HOURS_IN_DAY = 24;
    private final static int DAYS_IN_YEAR = 365;

    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);

    }

    public static void printYearsAndDays(long minutes){
        if (minutes < 0) {
            System.out.println(INV_VALUE);
        } else {

            long hours = minutes / MINS_IN_HOUR;
            long days = hours / HOURS_IN_DAY;
            long years = days / DAYS_IN_YEAR;
            days = days - years*DAYS_IN_YEAR;

            System.out.println(minutes + " min = " + years + " y and " + days + " d");

        }
    }
}
