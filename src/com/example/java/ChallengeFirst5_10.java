package com.example.java;

import java.util.Scanner;

public class ChallengeFirst5_10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a numeric value: ");
        String input1 = sc.nextLine();
        double d1 =Double.parseDouble(input1);

        System.out.println("Enter a numeric value:");
        String input2 =sc.nextLine();
        double d2 = Double.parseDouble(input2);

        double result = d1+d2;

        System.out.println("The Answer is: "+ result);
    }
}
