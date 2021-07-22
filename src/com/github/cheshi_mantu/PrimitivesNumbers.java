package com.github.cheshi_mantu;

public class PrimitivesNumbers {
    public static void main(String[] args) {
        int myInt = 10000;
        int myMinInt = Integer.MIN_VALUE;
        int myMaxInt = Integer.MAX_VALUE;

        System.out.println("Min for integer: " + myMinInt);
        System.out.println("Max for integer: " + myMaxInt);

        System.out.println("Integer is a wrapper class for primitive data type Integer");

        System.out.println("Error will be here : " + (myMaxInt + 1));

    }
}
