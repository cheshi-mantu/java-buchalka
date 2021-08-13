package com.github.cheshi_mantu.section4;

public class DurationConverter {
    public static void main(String[] args) {
        System.out.println(getDurationString(1, 1));
        System.out.println(getDurationString(60, 1));
        System.out.println(getDurationString(61, 60));
        System.out.println(getDurationString(121, 59));



        System.out.println(getDurationString(59));
        System.out.println(getDurationString(61));
        System.out.println(getDurationString(600));
        System.out.println(getDurationString(3671));


    }

    public static String getDurationString(int minutes, int seconds){
        int hoursNum;
        int minutesNum;

        if ((minutes < 0) || ((seconds < 0) || (seconds > 59))) {
            return "Invalid value";
        } else {
            hoursNum = (int) minutes / 60;
            minutesNum = (int) (minutes - hoursNum * 60);

            return prepend(hoursNum) + "h " + prepend(minutesNum) + "m " + prepend(seconds) + "s";
        }

    }
    public static String getDurationString(int seconds){
        int hoursNum;
        int minutesNum;
        int remSeconds;

        if (seconds < 0 ) {
            return "Invalid value";
        } else {

            minutesNum = (int) seconds / 60;
            remSeconds = (int) (seconds - minutesNum * 60);

            if (minutesNum <= 59 ) {
                return  "00h " +  prepend(minutesNum) + "m " + prepend(remSeconds) + "s";
            } else {

                return getDurationString(minutesNum, remSeconds);
            }

        }

    }
    private static String prepend(int numberToPrepend) {
        String resultString = "";
        if (numberToPrepend < 10) {
            resultString = "0" + numberToPrepend;
        } else {
            resultString = "" + numberToPrepend;
        }
    return resultString;
    }
}
