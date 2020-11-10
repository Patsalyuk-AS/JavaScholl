package patsalyukas.github.com;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Bobik", 5, Color.BLACK, true, true, true, true, false);
        Cat cat = new Cat("Murka", 4, Color.WHITE, true, true, true, false, true);
        System.out.println(dog);
        System.out.println(cat);
    }

}
