package com.example.java;

//  Formatting numeric values as strings

import java.text.NumberFormat;
import java.util.Locale;


public class NumericValueFormat5_7 {

    public static void main(String[] args) {

        Locale locale = new Locale("da", "Dk");

        double doubleValue = 1_234_567.89;

        NumberFormat numF = NumberFormat.getNumberInstance(locale);
        System.out.printf("Number:" + numF + "%n", doubleValue);

        NumberFormat curF = NumberFormat.getCurrencyInstance(locale);
        System.out.printf("Currency:" + curF + "%n", doubleValue);

        NumberFormat intF = NumberFormat.getIntegerInstance(locale);
        System.out.printf("Integer:" + intF + "%n", doubleValue);

    }
}
