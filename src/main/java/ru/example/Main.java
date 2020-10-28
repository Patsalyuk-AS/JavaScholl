package ru.example;

public class Main {
    public static void main(String[] args) {
        byte a = 5;
        short b = 10;
        System.out.println(sumTwoNumbers(a, b));
    }

    public static byte sumTwoNumbers(byte value1, short value2) {
        return (byte) (value1 + value2);
    }
}
