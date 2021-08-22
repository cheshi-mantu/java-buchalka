package com.github.cheshi_mantu.section5;

public class ForStatementExamples {
    public static void main(String[] args) {
        double amountOfMoney = 10001;
        for (int interestRate = 2; interestRate <= 9; interestRate++){
            System.out.println("Interest for " +  amountOfMoney + " and interest rate " + interestRate + " is " + String.format("%.2f",calculateInterestAmount(amountOfMoney, interestRate)));
        }


        for (int i = 2; i <= 200; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is a prime number!");
            }
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
