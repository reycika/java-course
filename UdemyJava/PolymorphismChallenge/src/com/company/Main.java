package com.company;

public class Main {

    public static void main(String[] args) {

        for (int i = 1; i < 11; i++) {
            Car car = randomCar();
            System.out.println("Car #" + i + " : " + car.getName() + "\n" +
            car.startEngine() + "\n" + car.accelerate() + "\n" + car.brake());
            System.out.println("Number of cylinders: " + car.getCylinders() + "\n");
        }
    }

    public static Car randomCar() {
        int randomNumber = (int) (Math.random() * 3) + 1;
        System.out.println("Random number generated was " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Renault(); // no need for break, because there is already return
            case 2:
                return new Volvo();
            case 3:
                return new Kia();
        }
        return null; // or put a default return null. but this is also correct.
    }
}

class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String startEngine() {
        return "startEngine() called -> Engine started";
    }

    public String accelerate() {
        return "accelerate() called -> Car is accelerating";
    }

    public String brake() {
        return "brake() called -> Car is braking";
    }
}

class Renault extends Car {
    public Renault() {
        super("Renault", 3);
    }

    @Override
    public String startEngine() {
        // a way to get Renault name
        return getClass().getSimpleName() + " -> Starting engine in Renault";
    }

    @Override
    public String accelerate() {
        return "accelerate() called -> Accelerating with Renault";
    }

    // no brake method here :)
}

class Volvo extends Car {
    public Volvo() {
        super("Volvo", 8);
    }

    @Override
    public String startEngine() {
        return "startEngine() called -> Starting engine in Volvo";
    }

    @Override
    public String accelerate() {
        return "accelerate() called -> Accelerating with Volvo";
    }

    @Override
    public String brake() {
        return super.brake();
    }
}

class Kia extends Car {
    public Kia() {
        super("Kia", 2);
    }

    @Override
    public String startEngine() {
        return "startEngine() called -> Starting engine in Kia";
    }

    @Override
    public String accelerate() {
        return "accelerate() called -> Accelerating with Kia";
    }

    @Override
    public String brake() {
        return "brake() called -> Braking with Kia";
    }
}
