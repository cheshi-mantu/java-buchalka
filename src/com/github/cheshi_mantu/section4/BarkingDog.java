package com.github.cheshi_mantu.section4;

public class BarkingDog {
    public static void main(String[] args) {

    }
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if (hourOfDay >=0 && hourOfDay <= 23) {
        return true;
        } else {
         return false;
        }
    }
}
