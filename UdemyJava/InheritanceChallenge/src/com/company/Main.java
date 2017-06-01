package com.company;

public class Main {

    public static void main(String[] args) {
        // Challenge.
        // Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
        // Finally, create another class, a specific type of Car that inherits from the Car class.
        // You should be able to hand steering, changing gears, and moving (speed in other words).
        // You will want to decide where to put the appropriate state and behaviours (fields and methods).
        // As mentioned above, changing gears, increasing/decreasing speed should be included.
        // For you specific type of vehicle you will want to add something specific for that type of car.

        // NOT REALLY A GOOD EXERCISE FOR ME, I DON'T KNOW SHIT ABOUT CARS - DON'T HAVE ANY IDEA
        // WHAT I SHOULD EVEN DISPLAY :)

        Vehicle newVehicle = new Vehicle("Car", 5, "fuel", 2000);
        System.out.println(newVehicle.getType());
        System.out.println(newVehicle.getSeats());
        System.out.println(newVehicle.getDrive());
        System.out.println(newVehicle.getWeight());

        System.out.println("-----------------------------------------------------------------");

        Car newCar = new Car(5, "electrical", 2000, "Renault",
                "Megane", 6, 260);
        System.out.println(newCar.getGears());
        System.out.println(newCar.getModel());
        System.out.println(newCar.getName());
        System.out.println(newCar.getTopSpeed());
        System.out.println(newCar.getDrive());
        System.out.println(newCar.getSeats());
        System.out.println(newCar.getType());

        System.out.println("--------------------------------------------------------------------");

        Outlander1 outlander1 = new Outlander1(36);
        outlander1.steer(45);
        outlander1.accelerate(30);
        outlander1.accelerate(20);
        outlander1.accelerate(-40);

    }
}
