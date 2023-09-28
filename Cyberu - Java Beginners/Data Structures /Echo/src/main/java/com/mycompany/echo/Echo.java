package com.mycompany.echo;

import java.util.*;

public class Echo {

    public static void main(String[] args) {

        // Scanner object to read input from console
        Scanner reader = new Scanner(System.in);

        //Array List that will only store strings
        ArrayList<String> memory = new ArrayList<String>();

        while(true) {

            // the nextLine function on Scanner reads a new line input from the user
            // then adds to the end of Array list
            memory.add(reader.nextLine());
            
            // Check if the last input in the ArrayList is "CLEAR"
            if((memory.get(memory.size()-1)).equals("CLEAR")) {
            //gets a string
            //compare string using .equals()

                //erase the entire ArrayList
                memory.clear();
            }
            
            //without the else statement nested outside, the program throws an error
            else{
                // Check if the last input in the ArrayList is "END"
                if ((memory.get(memory.size()-1)).equals("END"))

                //exit loop
                break;
            }

            //Print the contents of the ArrayList as a string
            System.out.println(memory.toString());
        }

        // Close the scanner to release resources 
        reader.close();
    }

    
}
