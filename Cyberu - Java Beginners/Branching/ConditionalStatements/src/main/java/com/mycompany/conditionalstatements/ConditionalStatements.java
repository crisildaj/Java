
package com.mycompany.conditionalstatements;

//Import the java.util package, which contains the Scanner class
import java.util.*;

public class ConditionalStatements {

    public static void main(String[] args) {
        
        //Create a Scanner object named 'reader' to read user input from the console
        Scanner reader = new Scanner(System.in);
        
        // Prompt the user to enter an integer and display "Input now: ".
        System.out.println("Input now: ");
        
        // Read an integer input from the user and store it in the 'input' variable.
        int input = reader.nextInt ();
        //String input = reader.next();
        //System.out.println(input); 
    


        // Check if the value stored in 'input' is greater than 10
        if(input > 10)
        //other operators: ==, !=, 
        {
            System.out.println("MORE!");
        }
        
        else
        {
            System.out.println("LESS!");  
      }
    }}
    