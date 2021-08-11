package com.github.cheshi_mantu.section4;

public class MethodsOverloading {
    public static void main(String[] args) {
        calculateScore("Geek", 10);
        calculateScore(10);
    }
    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Player without a name scored " + score + " points");
        return score * 1000;
    }
    public static int calculateScore() {
        System.out.println("No player and no score");
        return 0;
    }

}
