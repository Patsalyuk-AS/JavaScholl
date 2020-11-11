package com.github.patsalyukas;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DogTest {

    Dog dog = new Dog("Bobik", 5, Color.BLACK, true, true, true, true, false);

    @Test
    void makeSound() {
        assertEquals("Woof", dog.makeSound());
    }
}