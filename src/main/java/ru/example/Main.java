package ru.example;

public class Main {
    public static void main(String[] args) {
        byte a = 5;
        byte b = 10;
        System.out.println("Sum of two numbers: " + sumTwoNumbers(a, b));
        System.out.println("Product of two numbers:" + multiplyTwoNumbers(a, b));
        System.out.println("Max of two numbers: " + getMaxNumber(a, b));
        System.out.println(isCharA('A'));
        System.out.println(isCharNumber('0'));
        printBinary();
        printIntegerMaxBinary();
        System.out.println(getIntFromChar('A'));
        System.out.println(getCharFromInt(65));
    }

    public static byte sumTwoNumbers(byte a, short b) {

        return (byte) (a + b);
    }

    public static int multiplyTwoNumbers(int a, long b) {

        return (int) (a * b);
    }

    public static int getMaxNumber(int a, int b){

        return (a > b) ? a : b;
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
