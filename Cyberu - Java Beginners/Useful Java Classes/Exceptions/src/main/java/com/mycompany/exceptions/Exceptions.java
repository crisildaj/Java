package com.mycompany.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); //Initialise scanner object to read user input

        while (true) { // infinite loop
            try {
                System.out.print("Input a number: ");
                float input = reader.nextFloat(); //read user input as a float
                System.out.println("You input the number: " + input);

                // "\r" --> carriage return --> move cursor/text input to the beginning of the current line 
                System.out.println("\r\n");
            }

            catch(InputMismatchException e) { //Handle exception if input is invalid
                System.out.println("You passed invalid input. Not a float!");
                e.printStackTrace(System.out); //Print the exception's stack trace for debugging
                System.out.println("\r\n");
                // reader.nextLine();
            }
            //finally block executes no matter what - for clean up code
            finally {
                reader.nextLine(); //Consume any remaining newline characters in the input buffer
                reader.close(); //Close the Scanner to release resources 
            }
              
        }
                            
 }    
}

