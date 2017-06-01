package com.company;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        Dog dog = new Dog("MixedBreed", 20, 8, 4, 2, 1, 16, "black");
        //dog.eat();
        dog.walk();
        //dog.run();
    }
}
