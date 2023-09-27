package com.mycompany.unittesting;

import java.util.Scanner;

public class Demo2 {
    public static void main (String[] args) {

        double r, area, circum;
        Scanner reader = new Scanner(System.in);

        // Declare variables to store radius, area, and circumference.
        // 'r' will hold the radius, 'area' will hold the area of the circle,
        // and 'circum' will hold the circumference.

        // Create a Scanner object to read input from the console.
        // The Scanner class is used for reading user input.

        //Ask the user for input
        System.out.println("Enter the radius: ");

        // Read the radius entered by the user and store it in the 'r' variable.
        r = reader.nextDouble();

        //Calculate cirumference = 2πr
        circum = 2 * Math.PI * r;

        //Calculate area = πr^2
        area = Math.PI * Math.pow(r, 2);

        System.out.println("For a circle with radius " + r + ",");
        System.out.println(" the circumference is " + circum);
        System.out.println(" and the area is " + area + ".");

        reader.close();
    }
}
