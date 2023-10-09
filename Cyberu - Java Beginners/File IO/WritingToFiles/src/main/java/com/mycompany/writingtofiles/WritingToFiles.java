package com.mycompany.writingtofiles;

// Java Input/Output library
import java.io.*;

public class WritingToFiles {

    // The main method - entry point for the program
    public static void main(String[] args) throws IOException {

        // BufferedWriter maximises efficiency compared to FileWriter
        BufferedWriter out = null;
        // FileWriter out = null; // Alternative less efficient
        try {
            // BufferedWriter that appends to the "out.txt" file
            // The 'true' flag enables append mode
            out = new BufferedWriter (new FileWriter("out.txt", true));

            // Declares a variable called number of type 'long'
            for (long number: FibonnacciNumbers()) {

                // write method can only take strings and integers as values
                // Convert the 'number' to a String and write it to the file 
                out.write(String.valueOf(number) + "\r\n"); //newline - separates each number in the file

                //System.out.println(number); //prints output to console
            }
        }

        catch (IOException e) {
            // Handle exceptions related to file I/O
            System.err.println("File IO Failed.");
        }

        finally {
            // add throws IOException to the main method and close the BufferedWriter
            out.close();

            /* Not closing the BufferedWriter can result in data not being written and resource leakage */
        }
    }

    // Private method is only accessible within the WritingToFiles class
    private static long[] FibonnacciNumbers() {

        // Array to store the Fibonacci numbers with a length of 50
        long[] fibNumbers = new long[50];

        //Initialise the first two Fibonacci numers
        fibNumbers[0] = 0;
        fibNumbers[1] = 1;
        
        for(int i = 2; i < 50; i++) {

            // Each Fibonacci number is the sum of the previous two numbers 
            fibNumbers[i] = fibNumbers[i-1] + fibNumbers[i-2];
        }
        return fibNumbers;
    }
}
