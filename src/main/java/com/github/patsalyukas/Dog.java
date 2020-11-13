package com.github.patsalyukas;

import java.awt.*;

public class Dog extends Animal {
    public Dog(String name, int age, Color color, boolean canMove, boolean canEat, boolean canMakeSound, boolean canSwim, boolean canClimb) {
        super(name, age, color, canMove, canEat, canMakeSound, canSwim,canClimb);
    }

    @Override
    public String makeSound() {
        return("Woof");
    }
}
