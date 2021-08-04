package com.github.cheshi_mantu.section4;

public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(-5);
        printMegaBytesAndKiloBytes(10);
        printMegaBytesAndKiloBytes(1024);
        printMegaBytesAndKiloBytes(2048);
        printMegaBytesAndKiloBytes(4096);
        printMegaBytesAndKiloBytes(4097);

    }
    public static void  printMegaBytesAndKiloBytes(int kiloBytes){
        int oneMegaByte = 1024;
        int fullPart;
        int remainder;

        if(kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {

            fullPart = (int) (kiloBytes / oneMegaByte);
            remainder = kiloBytes % oneMegaByte;

            System.out.println(kiloBytes + " KB = " + fullPart + " MB and " + remainder + " KB");
        }
    }
}
