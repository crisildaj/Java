package com.mycompany.advancedmethods;

import java.util.Arrays;

public class AdvancedMethods {

    public static void main(String[] args) {
        // int x = 5
        int [] x = {5, 4, 3, 2, 1};
        int y = 7;

        // calling the magic method(function) created below
        magic(x);
        magic(y);

        // System.out.println("main: " + x);
        System.out.println("main: " + Arrays.toString(x));
        System.out.println("main: " + y);
    }

    // magic method created  - integer
    public static void magic(int input) {
        input += 10;
    }

    //method overloading but differentiated by arguments - integer array 
    public static void magic(int[] input) {

        // Loop through the elements of the input array and add 10 to each element
        for (int i = 0; i < input.length; i++) 
            input[i] += 10;
        
    }

}

/* Java is a "pass-by-value" language: pass an argument to a method --> a copy of the argument's value is created and passed to the method.
    --> the method operates on a copy of the value and not on the orginal variable itself
    --> value is not modified
    
    However, when you pass an object (such as an array) through a method, you are passing a reference to the same object in memory
    --> the original varible and the method parameter are in the same memory location, hence they are modificed
 */