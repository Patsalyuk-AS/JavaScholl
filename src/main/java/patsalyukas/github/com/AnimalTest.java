package patsalyukas.github.com;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    Animal animalTrueAllFilds = new Cat("TestAnimal", 1, Color.WHITE, true, true, true, true, true);
    Animal animalFalseAllFields = new Cat("TestAnimal", 1, Color.WHITE, false, false, false, false, false);

    @Test
    void startMoviving() {
        assertEquals("I'm moving.", animalTrueAllFilds.startMoviving());
        assertEquals("I can't move.", animalFalseAllFields.startMoviving());
    }

    @Test
    void stopMoving() {
        assertEquals("I'm not moving.", animalTrueAllFilds.stopMoving());
        assertEquals("I'm not moving.", animalFalseAllFields.stopMoving());
    }

    @Test
    void startEating() {
        assertEquals("I'm eating.", animalTrueAllFilds.startEating());
        assertEquals("I can't eat.", animalFalseAllFields.startEating());

    }

    @Test
    void stopEating() {
        assertEquals("I'm not eating.", animalTrueAllFilds.stopEating());
        assertEquals("I'm not eating.", animalFalseAllFields.stopEating());
    }

    @Test
    void startSwimming() {
        assertEquals("I'm swimming.", animalTrueAllFilds.startSwimming());
        assertEquals("I can't swim.", animalFalseAllFields.startSwimming());
    }

    @Test
    void stopSwimming() {
        assertEquals("I'm not swimming.", animalTrueAllFilds.stopSwimming());
        assertEquals("I'm not swimming.", animalFalseAllFields.stopSwimming());
    }

    @Test
    void startClimbing() {
        assertEquals("I'm climbing.", animalTrueAllFilds.startClimbing());
        assertEquals("I can't climb.", animalFalseAllFields.startClimbing());
    }

    @Test
    void stopClimbing() {
        assertEquals("I'm not climbing.", animalTrueAllFilds.stopClimbing());
        assertEquals("I'm not climbing.", animalFalseAllFields.stopClimbing());
    }
}