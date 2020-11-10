package patsalyukas.github.com;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    Dog dog = new Dog("Bobik", 5, Color.BLACK, true, true, true, true, false);

    @org.junit.jupiter.api.Test
    void makeSound() {
        assertEquals("Woof", dog.makeSound());
    }
}