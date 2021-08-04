package com.github.cheshi_mantu.section4;

public class BarkingDog {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 1)); //→ should return true
        System.out.println(shouldWakeUp(false, 2)); //→ should return false since the dog is not barking.
        System.out.println(shouldWakeUp(true, 8)); //→ should return false, since it's not before 8.
        System.out.println(shouldWakeUp(true, -1)); //→ should return false since the hourOfDay parameter needs to be in a range 0-23.


    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (!barking) {
            return false;
        } else {
            if ((hourOfDay < 0) || (hourOfDay > 23)) {
                return false;
            } else {
                return (hourOfDay < 8) || (hourOfDay > 22);
            }
        }
    }
}
