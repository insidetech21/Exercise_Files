package com.example.java;

public class BooleanExample {

    static boolean bDef;

    public static void main(String[] args)
    {
        boolean b1 = true;
        boolean b2 = false;

        System.out.println("The Value of b1 is:" + b1);
        System.out.println("The Value of b2 is:" + b2);
        System.out.println("The Value of bDef is:" + bDef);

        boolean b3 = !b1;
        System.out.println("The Value of b3 is:" + b3);

        int i1 = 0;
        boolean b4 =(i1 !=0);
        System.out.println("The Value of b4 is:" +b4);

        String sBoolean = "true";
        boolean parsed = Boolean.parseBoolean(sBoolean);
        System.out.println("Parsed:" + parsed);

    }
}
