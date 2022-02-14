package com.example.java;



public class ConvertingNumbers {

    public static void main(String[] args) {

        int intValue1 = 56;
        int intValue2 = intValue1;
        System.out.println("The 2nd value is " + intValue2);

        long longValue1 = intValue1;
        System.out.println("The Long value is " + longValue1);

        short shortValue1 = (short) intValue1;
        System.out.println("The Short Value is :" + shortValue1);

        int intValue3 = 1024;
        byte byteValue = (byte) intValue3;
        System.out.println("The byte Value is :" + byteValue);

        double doubleValue = 3.9999999d;
        int intValue4 = (int) doubleValue;

        System.out.println("Double to Int :" + intValue4);

    }

}

