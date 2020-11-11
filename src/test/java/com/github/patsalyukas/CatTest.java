package com.github.patsalyukas;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CatTest {

    Cat cat = new Cat("Murka", 4, Color.WHITE, true, true, true, false, true);

    @Test
    void makeSound() {
        assertEquals("Meow", cat.makeSound());
    }
}