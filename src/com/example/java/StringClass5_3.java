package com.example.java;

public class StringClass5_3 {

    public static void main(String[] args) {

        String s1 = "This is the String !";
        System.out.println(s1);

        String s2 = "This is also String !";
        System.out.println(s2);

        String s3 = "Shirt Size: ";
        String s4 = "M";
        String s5 = s3 + s4 + ", Qty: " + 4;  // Concatenation
        System.out.println(s5);

        char[] chars = {'H','e','l','l','o'};
        String s6 = new String(chars);
        System.out.println(s6);

        char[] chars2 = s6.toCharArray();
        for (char c: chars2){
            System.out.println(c);
        }


    }

}
