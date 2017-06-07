package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("------------------------------------------");
        System.out.println("               HAMBURGER                  ");
        System.out.println("------------------------------------------");

        HamburgerBread hamburgerBread = new HamburgerBread(true, false, false);

        HamburgerMeat hamburgerMeat = new HamburgerMeat(true, false, false, false);

        HamburgerAdditions hamburgerAdditions = new HamburgerAdditions(false,
                true, true, false, true, false, true);

        Hamburger hamburger = new Hamburger(hamburgerMeat, hamburgerBread, hamburgerAdditions);
        hamburger.createHamburger();

        System.out.println("------------------------------------------");
        System.out.println("           HEALTHY HAMBURGER              ");
        System.out.println("------------------------------------------");

        HealthyHamburgerMeat healthyHamburgerMeat = new HealthyHamburgerMeat(false, true, false);

        HealthyHamburgerAdditions healthyHamburgerAdditions = new HealthyHamburgerAdditions(true, true,
                true, true, true, false, true);

        HealthyHamburger healthyHamburger = new HealthyHamburger(healthyHamburgerMeat, healthyHamburgerAdditions);
        healthyHamburger.createHealthyHamburger();

        System.out.println("------------------------------------------");
        System.out.println("            DELUXE HAMBURGER              ");
        System.out.println("------------------------------------------");

        DeluxeHamburgerBread deluxeHamburgerBread = new DeluxeHamburgerBread(false, true, false);

        DeluxeHamburgerMeat deluxeHamburgerMeat = new DeluxeHamburgerMeat(true, true, false, false);

        DeluxeHamburger deluxeHamburger = new DeluxeHamburger(deluxeHamburgerMeat, deluxeHamburgerBread);
        deluxeHamburger.createDeluxeHamburger();
    }
}