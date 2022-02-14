package com.example.java;

public class ErrorsAndException06_01 {

    public static void main(String[] args) {
        String s = null;

        System.out.println(s);

        String welcome = "Welcome!";
        char[] chars = welcome.toCharArray();
        char lastchar = chars[chars.length - 1];
        System.out.println(lastchar);
    }


}
