package com.example.java;

// Programming conditional logic

public class IfElse07_01 {

    public static void main(String[] args) {
        int monthNumber = 8;

        if (monthNumber >=1 && monthNumber <=3 ){

            System.out.println("You are in Quarter 1");
        }else if (monthNumber >=4 && monthNumber <=6 ){

            System.out.println("You are in Quarter 2");

        } else if (monthNumber >=4 && monthNumber <=9 ){

            System.out.println("You are in Quarter 2");

        } else if (monthNumber >=10 && monthNumber <=12 ){

            System.out.println("You are in Quarter 4");

        } else {
            System.out.println("That's an unknown month!");
        }
    }



}
