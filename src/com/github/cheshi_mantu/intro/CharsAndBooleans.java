package com.github.cheshi_mantu.intro;

public class CharsAndBooleans {
    public static void main(String[] args) {
        char myChar = 'D';  // 16 bits
        char myUnicodeChar = '\u0044';  // using unicode encoding

        System.out.println("Mychar: " + myChar);
        System.out.println("My unicode char: " + myUnicodeChar);

        char myCopyRightUnicode = '\u00A9';
        System.out.println("My unicode copyright: " + myCopyRightUnicode);

        // here goes the boolean

        boolean myTrue = true;
        boolean myFalse = false;

        boolean isCutomerOverTwentyOne = true;


    }
}
