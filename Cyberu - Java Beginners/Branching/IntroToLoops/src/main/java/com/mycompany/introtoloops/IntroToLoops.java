package com.mycompany.introtoloops;

import java.util.*;

public class IntroToLoops {
    public static void main(String[] args){
        // Create a Scanner object to read input from the console.
        Scanner reader = new Scanner (System.in);

        // Declare a string variable to store user input.
        String input;

        // Initialize an empty string 'all' to store concatenated values from the user.
        String all = "";
        
        // Initialize an integer variable 'i' with the value 5. It will be used to control the loop.
        int i = 5;

        while (i > 0)
        {   
            // Read a line of text entered by the user.
            input = reader.nextLine();

            // Concatenate the user's input with the 'all' string.
            //all = all + input;
            all += input;
            
            // Decrement the value of 'i' by 1 for each iteration.
            // i = i - 1
            i--;

        }
        // Print the concatenated result of all user inputs.
        System.out.println(all);

        // Close the Scanner object to free up resources.
        reader.close();
    }
}


