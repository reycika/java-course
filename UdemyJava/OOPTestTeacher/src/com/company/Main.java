package com.company;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition1("Cheese", 1.12);
        System.out.println("Total burger price is " + hamburger.itemizeHamburger());

        System.out.println("----------------------------------------------------------");


        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.itemizeHamburger();
        healthyBurger.addHamburgerAddition1("Egg", 5.43);
        healthyBurger.addHealthAddition1("Lentils", 3.41);
        System.out.println("Total Healthy burger price is " + healthyBurger.itemizeHamburger());


        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.itemizeHamburger();
        deluxeBurger.addHamburgerAddition1("Should not do this", 50.53);
        deluxeBurger.itemizeHamburger();
    }
}
