package com.example.java;

// Converting primitive values to strings

import java.text.NumberFormat;

public class IntToString5_4 {

    public static void main(String[] args) {

        int intValue = 42;
        String fromInt =Integer.toString(intValue);
        System.out.println(fromInt);

        boolean boolValue = true;
        String fromBool = Boolean.toString(boolValue);
        System.out.println(fromBool);

        long longValue = 10_000_000;
        NumberFormat formatter = NumberFormat.getNumberInstance();
        String formatted = formatter.format(longValue);
        System.out.println(formatted);


    }
}
