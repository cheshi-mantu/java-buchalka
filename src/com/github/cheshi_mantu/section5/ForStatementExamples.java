package com.github.cheshi_mantu.section5;

public class ForStatementExamples {
    public static void main(String[] args) {
        double amountOfMoney = 10000;
        for (int interestRate = 2; interestRate <= 5; interestRate++){
            System.out.println("Interest for " +  amountOfMoney + " and interest rate " + interestRate + " is " + calculateInterestAmount(amountOfMoney, interestRate));
        }
     }
    public static double calculateInterestAmount(double amount, double interestRate) {
        return(amount * (interestRate)/100);

    }
}
