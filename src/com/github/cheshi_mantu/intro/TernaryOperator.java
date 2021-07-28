package com.github.cheshi_mantu.intro;

public class TernaryOperator {

    public static void main(String[] args) {

        boolean isCar = false;

        boolean wasCar = isCar ? true : false;

        System.out.println("wasCar is " + wasCar);

        // challenge here

        double firstDoubleVar = 20.0d;
        double secondDoubleVar = 80.00d;

        double firstResult = 100 * (firstDoubleVar + secondDoubleVar);

        double remainder = firstResult % 40.0d;

        boolean isRemainderZero = remainder == 0 ? true : false;

        System.out.println("is the remainder a zero? - " + isRemainderZero + " " + remainder);

        if (isRemainderZero) {
            System.out.println("The remainder is zero " + remainder);
        }
        else {
            System.out.println("The remainder is something more than zero: " + remainder);
        }


    }

}
