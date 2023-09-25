
package com.mycompany.complexconditionals;

import java.util.*;

public class ComplexConditionals {

    public static void main(String[] args) {
        //Create a Scanner object named 'reader' to read user input from the console
        Scanner reader = new Scanner(System.in);

        System.out.println("Input: ");
        // Read a String input from the user and store it in the 'input' variable.
        String input = reader.next();

        

        String sOne = "abc";
        String sTwo = "z";
        


        // if(input.contains(sOne) && input.contains(sTwo))
        if((input.contains(sOne) || input.contains(sTwo)) && false)
        // the '&&false" condition always evaluates to false, 
        // making the entire condition false regardless of the 'input' content
        {
            System.out.println("TRUE");
        }
        else 
        {
            System.out.println("FALSE");
        }


    }
}
