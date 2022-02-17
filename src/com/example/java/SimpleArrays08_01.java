                                                     // *** Using simple arrays *** //
package com.example.java;

import java.util.Arrays;

public class SimpleArrays08_01 {

    public static void main(String[] args) {

        System.out.println("Array of primitive");
        int[] ints = {9, 6, 3};
        Arrays.parallelSort(ints);
        for (int i = 0; i < ints.length ; i++) {
            System.out.println(ints[i]);
        }

        System.out.println("Array of string");
        String[] strings = {"Red", "Green", "Blue"};
        Arrays.sort(strings);
        for (String color : strings ) {
            System.out.println(color);
        }

        System.out.println("Setting an initial size");
        int[] sized = new int[10];
        for (int i = 0; i < sized.length; i++) {
            sized[i] = i * 100;
        }
        for (int value : sized){
            System.out.println(value);
        }

        System.out.println("Copying an array");

        int[] copied = new int[5];
        System.arraycopy(sized,5, copied, 0,5);
        for (int value : copied){
            System.out.println(value);
        }
    }
}
