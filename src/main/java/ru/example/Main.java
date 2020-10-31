package ru.example;

public class Main {
    public static void main(String[] args) {
        byte a = 5;
        byte b = 10;
        System.out.println("Sum of two numbers: " + sumTwoNumbers(a, b));
        System.out.println("Product of two numbers:" + multiplyTwoNumbers(a, b));
        System.out.println("Max of two numbers: " + getMaxNumber(10, 10));
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

}
