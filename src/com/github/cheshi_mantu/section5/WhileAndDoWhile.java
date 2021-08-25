package com.github.cheshi_mantu.section5;

public class WhileAndDoWhile {
    public static void main(String[] args) {
//        int count = 0;
//        while(count != 5) {
//            System.out.println("Count = " + count);
//            count++;
//        }
//
//        count = 1;
//        while (true) {
//            System.out.println("Count = " + count);
//            count++;
//            if (count == 6) {
//                break;
//            }
//        }
//// here comes the do while
//        count = 1;
//        do {
//            System.out.println("Count = " + count);
//            count++;
//        } while (count != 6);

    int number = 4;
    int finishNumber = 20;

    while (number <= finishNumber) {
        number ++;
        if(!isEvenNumber(number)){
            continue;
        }
        System.out.println("Even number " + number);

    }

    }

    public static boolean isEvenNumber(int numberToCheck){
        if (numberToCheck % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }
}
