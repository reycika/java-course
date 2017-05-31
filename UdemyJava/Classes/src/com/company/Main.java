package com.company;

public class Main {

    public static void main(String[] args) {
        Car porsche = new Car();
        Car renault = new Car();
        Car volkswagen = new Car();

        porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel());

        renault.setModel("Megane");
        System.out.println("Model is " + renault.getModel());

        volkswagen.setModel("Polo");
        System.out.println("Model is " + volkswagen.getModel());


    }
}
