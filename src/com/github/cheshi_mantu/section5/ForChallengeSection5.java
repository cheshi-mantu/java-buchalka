package com.github.cheshi_mantu.section5;

public class ForChallengeSection5 {
    public static void main(String[] args) {
        int desiredNumbersSum = 0;
        int counterToFive = 0;
        for (int i = 1; i <=1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                counterToFive++;
                desiredNumbersSum += i;
                System.out.println("Matching number is " + i);
                if (counterToFive == 5) {
                    break;
                }
            }

        }
        System.out.println("The sum of the numbers is " + desiredNumbersSum);
    }
}
