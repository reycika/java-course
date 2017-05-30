package com.company;

import javax.xml.bind.SchemaOutputResolver;

public class Main {

    public static void main(String[] args) {

        // int has a width of 32
        // da so številke bolj berljive, lahko uporabljaš podčrtaje
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myTotal = (myMinValue/2);
        System.out.println("myTotal = " + myTotal);

        // byte has a width of 8
        byte myByteValue = 10;
        byte myMinByteValue = -128;
        byte myMaxByteValue = 127;
        byte myNewByteValue = (byte) (myMinByteValue/2);
        System.out.println("myNewByteValue = " + myNewByteValue);

        // short has a width of 16
        short myMinShortValue = -32768;
        short myMaxShortValue = 32767;
        short myNewShortValue = (short) (myMinShortValue/2);
        System.out.println("myNewShortValue = " + myNewShortValue);

        // long has a width of 64
        long myMinLongValue = -9_223_372_036_854_775_808L;
        long myMaxLongValue = 9_223_372_036_854_775_807L;

        System.out.println("------------------------------------------------------");
        System.out.println("TASK #1");
        System.out.println("------------------------------------------------------");

        // Task
        // 1. Create a byte variable and set it to any valid byte number
        // 2. Create a short variable and set it to any valid short number
        // 3. Create an int variable and set it to any valid byte number
        // 4. Create a variable of type long, and make it equal to 5000 + 10 times
        // the sum of the byte, short and int

        byte anyByteNumber = 15;
        short anyShortNumber = 12;
        int anyIntNumber = 35;
        long sumOfByteShortInt = 50000 + 10 * (anyByteNumber + anyShortNumber + anyIntNumber);
        short sumOfShortIntByte = (short) + (1000 + 10 * (anyByteNumber + anyShortNumber + anyIntNumber));
        System.out.println("Sum of 50000 and 10 times the sum of byte, short and int = " + sumOfByteShortInt);
        System.out.println("Sum of 1000 and 10 times the sum of byte, short and int = " + sumOfShortIntByte);

    }
}
