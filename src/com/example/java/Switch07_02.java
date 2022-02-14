package com.example.java;

import java.util.Scanner;

// Using the switch conditional statement
public class Switch07_02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String input = sc.nextLine();
        int monthNumber = Integer.parseInt(input);

    /*    // This is old version of Switch case condition statement


     switch (monthNumber){
            case 1:
                System.out.println("The month is January");
                break;
            case 2:
                System.out.println("The month is February");
                break;
            case 3:
                System.out.println("The month is March");
                break;
            case 4:
                System.out.println("The month is April");
                break;
            case 5:
                System.out.println("The month is May");
                break;
            case 6:
                System.out.println("The month is June");
                break;
            default:
                System.out.println("You chose another month !");
        } */


        // This is enhanced version of Switch condition statement
        switch (monthNumber) {
            case 1 -> System.out.println("The month is January");
            case 2 -> System.out.println("The month is February");
            case 3 -> System.out.println("The month is March");
            case 4 -> System.out.println("The month is April");
            case 5 -> System.out.println("The month is May");
            case 6 -> System.out.println("The month is June");
            default -> System.out.println("You chose another month !");
        }
    }


}
