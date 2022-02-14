package com.example.java;

import java.util.Scanner;

// Using the switch conditional statement
public class Switchstring07_02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();
       // int input = Integer.parseInt(input);

     // This is old version of Switch case condition statement


   /*  switch (input){
            case "Jan":
                System.out.println("The month is January");
                break;
            case "Feb":
                System.out.println("The month is February");
                break;
            case "Mar":
                System.out.println("The month is March");
                break;
            case "Apr":
                System.out.println("The month is April");
                break;
            case "May":
                System.out.println("The month is May");
                break;
            case "Jun":
                System.out.println("The month is June");
                break;
            default:
                System.out.println("You chose another month !");
        } */


     // This is enhanced version of Switch condition statement
        switch (input) {
            case "Jan" -> System.out.println("The month is January");
            case "Feb" -> System.out.println("The month is February");
            case "Mar" -> System.out.println("The month is March");
            case "Apr" -> System.out.println("The month is April");
            case "May" -> System.out.println("The month is May");
            case "June" -> System.out.println("The month is June");
            default -> System.out.println("You chose another month !");
        }
    }


}
