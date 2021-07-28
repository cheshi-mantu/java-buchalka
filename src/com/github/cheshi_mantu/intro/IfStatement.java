package com.github.cheshi_mantu.intro;

public class IfStatement {
    public static void main(String[] args) {
        boolean isAlien = false; // assignment
        if (isAlien == false) { // evaluation operator
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;

        if (topScore >= 80) {
            System.out.println(" You've got the top score");
        }
        // logical AND
        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore <= 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Top score is in the right range");
        }



    }
}
