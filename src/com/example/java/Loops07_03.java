package com.example.java;

public class Loops07_03 {

    public static void main(String[] args) {

        String[] months ={"January", "February", "March",
                "April", "May", "June", "July",
                "August", "September", "October",
                "November", "December"};

//        for (int i = 0; i < months.length; i++) {
//            System.out.println(months[i]);
//        }

//          for (int i = months.length-1; i >=0 ; i--) {
//            System.out.println(months[i]);
//        }

//        for (String month : months){                   //for each Loop
//            System.out.println(month);
//        }

//        int counter = 0;
//        while (counter < months.length){                 //while loop
//            System.out.println(months[counter]);
//            counter++;
//        }
        int counter = 0;
        do {                 // Do- while loop
            System.out.println(months[counter]);
            counter++;
        } while (counter < months.length);

    }
}
