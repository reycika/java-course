package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("\u002410,000 at 2% interest is \u0024" + calculateInterest(10_000.0, 2.0));

        System.out.println("----------------------------------------------");
        System.out.println("TASK 9a");
        System.out.println("----------------------------------------------");

        // Using the for statement, call the calculateInterest method with
        // the amount of 10,000 with an interestRate of 2, 3, 4, 5, 6, 7 and 8
        // and print the results to the console window

        // String.format("%.2f", 123.45878478474) will round the number 123.45878478474 to 2 decimals -> 123,46
        for (int i = 2; i <= 8; i++) {
            System.out.println("\u002410,000 at " + i + "% interest is \u0024" + String.format("%.2f", calculateInterest(10_000.0, i)));
        }

        System.out.println("----------------------------------------------");
        System.out.println("TASK 9b");
        System.out.println("----------------------------------------------");

        // modify the for loop to start from 8% to 2%
        for (int i = 8; i >= 2; i--) {
            System.out.println("\u002410,000 at " + i + "% interest is \u0024" + String.format("%.2f", calculateInterest(10_000.0, i)));
        }



        System.out.println("----------------------------------------------");
        System.out.println("TASK 9c");
        System.out.println("----------------------------------------------");

        // Create a for statement using any range of numbers
        // Determine if the number is the prime number using the isPrimeNumber method
        // if it is a prime number print it out AND increment a count of the
        // number of prime numbers found
        // if that count is 3, exit the for loop
        // hint: use break; statement to exit the for loop

        int foundPrimes = 0;
        for (int i = 2; i < 2_000; i++) {
            if (isPrimeNumber(i)) {
                foundPrimes++;
                System.out.println("Prime number: " + i + " - So far count: " + foundPrimes);
                if (foundPrimes == 10) {
                    System.out.println("We found " + foundPrimes + " prime numbers, we are exiting the loop.");
                    break;
                }
            }
        }

        System.out.println("----------------------------------------------");
        int n = 1987;
        boolean isPrime = isPrimeNumber(n);
        System.out.println(n + " is a prime number: " + isPrime);

    }



    public static boolean isPrimeNumber(int number) {
        if (number == 1) {
            return false;
        }

        for (int i = 2; i <= number/2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;

        // for statement could also look like:
        /*for (int i = 2; i <= (long) Math.sqrt(number); i++) {
            System.out.println("Looping " + i);
            if (number % i == 0) {
                return false;
            }
        }
        return true;*/
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate/100));
    }
}
