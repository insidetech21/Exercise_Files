package com.example.java;

public class Debugging06_02 {

    public static void main(String[] args) {

        String welcome = "Welcome!";
        char[] chars = welcome.toCharArray();

        for (int i=0; i<chars.length; i++)
            System.out.println(chars[i]);
    }
}
