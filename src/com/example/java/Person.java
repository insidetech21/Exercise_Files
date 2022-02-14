package com.example.java;



class Person // Male & Female Pgm
{
    public static void main(String[] args) {
        boolean male = false;
        int age = 30;

        if (male)
            if(age<20)
                System.out.println("Boy");
        else
                System.out.println("Man");
        else
            if(age<20)
                System.out.println("Girl");
            else
                System.out.println("Women");
    }
}

/* public class Person {

    private String name;
    public  String getName(){
        return name;
    }

    public  void setName(String newName){
        this.name = newName;
    }
}*/

/* class  Person {
    public static void main(String[] args) {
        int a = 8;
        System.out.println( a++ * 3);
    }
} */



/*public class Person {
    public static void main(String argv[]) {
        double n = 5;
        switch (n) {
            case 5:
                System.out.println("10");
                break;
            case 5.0000000:
                System.out.println("30");
        }
        break;
        default:
        System.out.println("0");
    }
}
}*/

/* public class Person {
    public static void main(String args[])
    {
        String a = new String("ALPHA");

    }
    String b = new String(a);
    System.out.println(a == b);
} */

