package com.company;

public class Main {

    public static void main(String[] args) {

        // width of int = 32 (4 bytes)
        int myIntValue = 10/3;

        // width of float = 32 (4 bytes)
        float myFloatValue = (float) (5.4 / 2);
        float myFloatValue2 = 5.3f / 3f;

        // width of double = 64 (8 bytes)
        double myDoubleValue = 5d / 3d;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myFloatValue2 = " + myFloatValue2);
        System.out.println("myDoubleValue = " + myDoubleValue);

        System.out.println("------------------------------------------------------");
        System.out.println("TASK 2: Convert a given number of pounds to kilograms");
        System.out.println("------------------------------------------------------");

        // Convert a given number of pounds to kilograms
        // 1. Create a variable to store the number of pounds
        // 2. Calculate the number of kilograms for the number above and store it into
        // a variable
        // 3. Print the result
        //
        // Notes: 1 pound is equal to 0.45359237 kilograms

        double pound = 0.45359237d;
        double howMuchPoundsWeHave = 200d;
        double fromPoundToKilo = howMuchPoundsWeHave * pound;
        System.out.println("From 53.452154 pounds, we get " + fromPoundToKilo + " kilos.");
    }
}
