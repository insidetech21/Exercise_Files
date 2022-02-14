package com.example.java;

// Comparing string values
public class StringCompare5_6 {

    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "Hello";

        if(str1 == str2){

            System.out.println("They Match !");
        }
        else {
            System.out.println("They Don't Match !");
        }

        String str3 = "hello";

        if(str1 == str3){
            System.out.println("They Match !");
        }
        else {
            System.out.println("They Don't Match !");
        }

        String part1 = "Hello ";
        String part2 = "World";
        String str4 = part1 + part2;
        String str5 ="Hello World";

        if(str4.equals(str5)){
            System.out.println("They Match !");
        }
        else {
            System.out.println("They Don't Match !");
        }

        String part6 = "Hello ";
        String part7 = "WORLD";
        String str6 = part6 + part7;
        String str7 ="Hello World";

        if(str6.equals(str7)){
            System.out.println("They Match !");
        }
        else {
            System.out.println("They Don't Match !");
        }

        String part8 = "Hello ";
        String part9 = "WORLD";
        String str8 = part8 + part9;
        String str9 ="Hello World";

        if(str8.equalsIgnoreCase(str9)){
            System.out.println("They Match !");
        }
        else {
            System.out.println("They Don't Match !");
        }



    }


}
