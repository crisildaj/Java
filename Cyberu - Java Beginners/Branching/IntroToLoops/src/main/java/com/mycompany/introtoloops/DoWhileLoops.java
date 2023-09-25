package com.mycompany.introtoloops;

import java.util.*;

public class DoWhileLoops {
    public static void main(String[] args){
        // Create a Scanner object to read input from the console.
        Scanner reader = new Scanner (System.in);

        // Declare a string variable to store user input.
        String input;

        // Initialize an empty string 'all' to store concatenated values from the user.
        String all = ""; 

        // Start a do-while loop. This loop will always execute at least once.
        do
        {
            // Read a line of text entered by the user.
            input = reader.nextLine();

            // Concatenate the user's input with the 'all' string.
            //all = all + input;
            all += input;
        }
        
        // Continue the loop as long as the user's input is not equal to "STOP."
        while (!input.equals("STOP"));
            {   
        
        // At this point, the user has entered "STOP," so we exit the loop.
        
        // Print the concatenated result of all user inputs. This will include "STOP".
        System.out.println(all);
            
        }
        

        // Close the Scanner object to free up resources.
        reader.close();
    }

    
}
