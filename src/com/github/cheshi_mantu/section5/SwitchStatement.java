package com.github.cheshi_mantu.section5;

public class SwitchStatement {
    public static void main(String[] args) {
        int testValue = 2;
        switch(testValue) {
            case 1:
                System.out.println("was 1");
                break;
            case 2:
                System.out.println("was 2");
                break;
            case 3:
                System.out.println("was 3");
                break;
            case 4:
                System.out.println("was 4");
                break;
            case 5:
                System.out.println("was 5");
                break;
            default:
                System.out.println("Misc.");
                break;
        }
        swithcChar('A');
        swithcChar('K');

    }
    public static void swithcChar(char inputChar){
        switch(inputChar) {
            case 'A':
                System.out.println("T'was A");
                break;
            case 'B':
                System.out.println("T'was B");
                break;
            case 'C':
                System.out.println("T'was C");
                break;
            case 'D':
                System.out.println("T'was D");
                break;
            default:
                System.out.println("T'was something else like " + inputChar + ", sorry I'm tired");
                break;
        }

    }
}
