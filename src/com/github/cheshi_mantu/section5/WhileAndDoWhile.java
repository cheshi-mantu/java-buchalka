package com.github.cheshi_mantu.section5;

public class WhileAndDoWhile {
    public static void main(String[] args) {
        int count = 0;
        while(count != 5) {
            System.out.println("Count = " + count);
            count++;
        }

        count = 1;
        while (true) {
            System.out.println("Count = " + count);
            count++;
            if (count == 6) {
                break;
            }
        }

    }
}
