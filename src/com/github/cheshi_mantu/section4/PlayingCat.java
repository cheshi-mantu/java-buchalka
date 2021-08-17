package com.github.cheshi_mantu.section4;

public class PlayingCat {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 20));
        System.out.println(isCatPlaying(true, 25));
        System.out.println(isCatPlaying(true, 30));
        System.out.println(isCatPlaying(true, 35));
        System.out.println(isCatPlaying(true, 45));
        System.out.println(isCatPlaying(true, 46));
        System.out.println(isCatPlaying(true, 55));
        System.out.println(isCatPlaying(false, 20));
        System.out.println(isCatPlaying(false, 25));
        System.out.println(isCatPlaying(false, 30));
        System.out.println(isCatPlaying(false, 35));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 37));
        System.out.println(isCatPlaying(false, 50));

    }
    public static boolean isCatPlaying(boolean summer, int temperature) {
        int upperTempLimit;
        if (summer) {
            upperTempLimit = 45;
        } else {
            upperTempLimit = 35;
        }
        if (temperature >= 25 && temperature <= upperTempLimit ) {
            return true;
        } else {
            return false;
        }
    }
}
