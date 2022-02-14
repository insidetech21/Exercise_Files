package com.example.java;

public class MultiCatch06_04 {

    public static void main(String[] args) {

        String welcome = "Welcome!";
        char[] chars = welcome.toCharArray();

        try {
            char lastChar = chars[chars.length - 1];
            System.out.println(lastChar);

            String sub = welcome.substring(10);
        } catch (ArrayIndexOutOfBoundsException e) {
   //         e.printStackTrace();
            System.out.println("Array Index Problem!");
        } catch (StringIndexOutOfBoundsException e){
            System.out.println("String Index Problem!");

        }
    }

}
