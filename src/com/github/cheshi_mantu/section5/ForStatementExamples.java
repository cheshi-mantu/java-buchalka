package com.github.cheshi_mantu.section5;

public class ForStatementExamples {
    public static void main(String[] args) {
        double amountOfMoney = 10001;
        for (int interestRate = 2; interestRate <= 9; interestRate++){
            System.out.println("Interest for " +  amountOfMoney + " and interest rate " + interestRate + " is " + String.format("%.2f",calculateInterestAmount(amountOfMoney, interestRate)));
        }

        // producing 9 prime numbers
        int count = 0;
        for (int i = 200; i <= 1000; i++) {

            if (isPrime(i)) {
                count++;
                System.out.println(i + " is a prime number!");

            }
            if (count == 9) break;
        }
     }
    public static double calculateInterestAmount(double amount, double interestRate) {
        return(amount * (interestRate)/100);

    }
    public static boolean isPrime(int n) {

        if(n == 1) {
            return false;
        }

        for(int i=2; i <= n/2; i++) {
//            System.out.println("Looping " +i);
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }


}
