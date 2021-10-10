package com.github.cheshi_mantu.section5;

public class FactorPrinter {
    public static void main(String[] args) {
        printFactors(10);
    }
    public static void printFactors(int number){
        if (number < 1) {
            System.out.println("Invalid Value");
        } else {
            int cntr = 1;
            while (cntr <= number) {
                if (number % cntr == 0) {
                    System.out.println(""+cntr);
                }
                cntr++;
            }
        }
    }
}
