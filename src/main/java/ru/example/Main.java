package ru.example;

public class Main {
    public static void main(String[] args) {
        byte a = 5;
        short b = 10;
        System.out.println(sumTwoNumbers(a, b));
        System.out.println(multiplyTwoNumbers(a, b));
    }

    public static byte sumTwoNumbers(byte a, short b) {
        return (byte) (a + b);
    }

    public static int multiplyTwoNumbers(int a, long b) {
        return (int) (a * b);
    }

}
