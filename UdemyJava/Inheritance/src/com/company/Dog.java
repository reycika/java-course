package com.company;

/**
 * Created by renata on 01-Jun-17.
 */
public class Dog extends Animal {

    private int legs;
    private int eyes;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int legs, int eyes, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.legs = legs;
        this.eyes = eyes;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;

    }
    // only class Dog can access this method
    private void chew() {
        System.out.println("dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("dog.eat() called");
        chew();
        super.eat();
    }

    public void walk() {
        System.out.println("dog.walk() called");
        // execute move method from Animal class
        super.move(5);
    }

    public void run() {
        System.out.println("dog.run() called");
        move(10);
    }

    private void moveLegs(int speed) {
        System.out.println("Dog.moveLegs() called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called.");
        moveLegs(speed);
        super.move(speed);
    }
}
