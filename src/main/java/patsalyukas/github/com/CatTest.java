package patsalyukas.github.com;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    Cat cat = new Cat("Murka", 4, Color.WHITE, true, true, true, false, true);

    @Test
    void makeSound() {
        assertEquals("Meow", cat.makeSound());
    }
}