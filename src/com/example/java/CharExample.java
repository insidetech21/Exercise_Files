package com.example.java;

public class CharExample {

    public static void main(String[] args) {
        char c1 = '1';
        char c2 = '2';
        char c3 = '3';

        System.out.println("Char 1:" + c1);
        System.out.println("Char 3:" + c2);
        System.out.println("Char 2:" + c3);

        char dollarsign = '\u0024';
        System.out.println("Currency:" +dollarsign);

        char a1 = 'a';
        char a2 = 'b';
        char a3 = 'c';
        System.out.print(Character.toUpperCase(a1));
        System.out.print(Character.toUpperCase(a2));
        System.out.println(Character.toUpperCase(a3));



    }
}
