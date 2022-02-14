package com.example.java;

// Building a string from multiple values

import java.util.Scanner;

public class StringBuilder5_5 {

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1+ ", " + str2 + "!";
        System.out.println(str3);

       /* StringBuilder sb = new StringBuilder("Hello");
        sb.append(", ");
        sb.append("World");
        sb.append("!");
        System.out.println(sb); */

        StringBuilder sb = new StringBuilder("Hello")
                .append(", ")
                .append("World")
                .append("!");
        System.out.println(sb);
        System.out.println(sb);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Value :");
        String input = scanner.nextLine();
        System.out.println(input);

        sb.delete(0, sb.length());
        for (int i = 0; i < 3; i++) {
            input =scanner.nextLine();
            sb.append(input + "\n");
        }
        System.out.println(sb);
    }

}