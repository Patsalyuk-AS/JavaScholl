package patsalyukas.github.com;

import static patsalyukas.github.com.FirstHomeWord.*;

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



}
