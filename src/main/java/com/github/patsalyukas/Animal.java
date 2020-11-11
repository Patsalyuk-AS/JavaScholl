package com.github.patsalyukas;

import java.awt.*;

public abstract class Animal {

    private String name;
    private int age;
    private Color color;
    private boolean canMove;
    private boolean canEat;
    private boolean canMakeSound;
    private  boolean canSwim;
    private boolean canClimb;

    public Animal(String name, int age, Color color, boolean canMove, boolean canEat, boolean canMakeSound, boolean canSwim,boolean canClimb) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.canMove = canMove;
        this.canEat = canEat;
        this.canMakeSound = canMakeSound;
        this.canSwim = canSwim;
        this.canClimb = canClimb;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isCanMove() {
        return canMove;
    }

    public void setCanMove(boolean canMove) {
        this.canMove = canMove;
    }

    public boolean isCanEat() {
        return canEat;
    }

    public void setCanEat(boolean canEat) {
        this.canEat = canEat;
    }

    public boolean isCanMakeSound() {
        return canMakeSound;
    }

    public void setCanMakeSound(boolean canMakeSound) {
        this.canMakeSound = canMakeSound;
    }

    public boolean isCanSwim() {
        return canSwim;
    }

    public void setCanSwim(boolean canSwim) {
        this.canSwim = canSwim;
    }

    public boolean isCanClimb() {
        return canClimb;
    }

    public void setCanClimb(boolean canClimb) {
        this.canClimb = canClimb;
    }

    public  String startMoviving() {
        if (canMove) {
            return("I'm moving.");
        } else {
            return("I can't move.");
        }
    }

    public String stopMoving(){
        return("I'm not moving.");
    }

    public String startEating(){
        if (canEat) {
            return ("I'm eating.");
        } else {
            return ("I can't eat.");
        }
    }

    public String stopEating(){
        return ("I'm not eating.");
    }

    public String startSwimming(){
        if (canSwim) {
            return ("I'm swimming.");
        } else {
            return ("I can't swim.");
        }
    }

    public String stopSwimming(){
        return ("I'm not swimming.");
    }

    public String startClimbing(){
        if (canClimb) {
            return ("I'm climbing.");
        } else {
            return ("I can't climb.");
        }
    }

    public String stopClimbing(){
        return ("I'm not climbing.");
    }

    @Override
    public String toString() {
        return "My name is " + name + "." + System.lineSeparator() +
                "I'm " + age + " years old." + System.lineSeparator() +
                ((canMove)?"I can move.":"I can't move.") + System.lineSeparator() +
                ((canEat)?"I can eat.":"I can't eat.") + System.lineSeparator() +
                ((canMakeSound)?"I can make sound.":"I can't make sound.") + System.lineSeparator() +
                ((canSwim)?"I can swim.":"I can't swim.") + System.lineSeparator() +
                ((canClimb)?"I can climb the trees.":"I can't climb the trees.");
    }

    public abstract String makeSound();

}
