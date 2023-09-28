package com.mycompany.alphabet;



public class Arrays2 {
    public static void main (String[] args) {

    /* In Java, you can't directly print the 
    default values for primitive data types or uninitialized elements in an array because 
    the default values are often considered as a starting point for variables, 
    and Java doesn't provide a built-in mechanism to directly access these values.*/

    char[] emptyCharArray = new char[0];
    System.out.println(emptyCharArray);
    }
}
