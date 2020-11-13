package com.github.patsalyukas;

public class FirstHomeWork {

    public static byte sumTwoNumbers(byte a, short b) {

        return (byte) (a + b);
    }

    public static int multiplyTwoNumbers(int a, long b) {

        return (int) (a * b);
    }

    public static int getMaxNumber(int a, int b){

        return Math.max(a, b);
    }

    public static boolean isCharA(char ch){
        return ch == 'A';
    }

    public static boolean isCharNumber(char ch){
        return Character.isDigit(ch);
    }

    public static void printBinary(){
        for(int i = 0; i <=30; i++){
            System.out.println(i + ": " + Integer.toBinaryString(i));
        }
    }

    public static void  printIntegerMaxBinary(){
        System.out.println("Integer.MAX_VALUE: " + Integer.toBinaryString(Integer.MAX_VALUE));
        System.out.println("Integer.MAX_VALUE + 1: " + Integer.toBinaryString(Integer.MAX_VALUE + 1));
    }

    public static int getIntFromChar(char ch){
        return ch;
    }

    public static char getCharFromInt(int a){
        return (char) a;
    }
}
