package com.mycompany.strings;

public class Strings {

    public static void main(String[] args) {
        //Instantiate CustomPrinter class
        CustomPrinter printer = new CustomPrinter("> > %s < <"); //custom format string
        // %s = string placeholder
        /*Other placeholders in the String.format method include: 
         * - %d = integer values
         * - %f = floats
         * - %c = characters
         * - %b = booleans
         * - %x or %X = hexadecimal representation
         */



        String s1 = new String("Strings are arrays of characters");
        String s2 = new String("Strings are arrays of characters");

        /*  Unlike other primitive data types (int, char, boolean), Strings is a Class --> unlike other data types, strings have: 
         * - immutability
         * - special literal handling
        */

        printer.println("string1: " + s1.replace("characters", "char"));
        printer.println("string2: " + s2);
        
        //printer.println (s1 == s2); // returns false because its checking for the same memory location 
        //printer.println(s1.equals(s2)); // returns true because its comparing the value of the objects, s1 and s2
    }
}
