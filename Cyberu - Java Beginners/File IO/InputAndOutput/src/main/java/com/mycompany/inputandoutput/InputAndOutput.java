package com.mycompany.inputandoutput;

import java.io.*;
import java.util.Scanner;


public class InputAndOutput {

    public static void main(String[] args) throws IOException{
        // Define the names of the input and output files
        File outFile = new File("OutputFile.txt");
        File inFile = new File("InputFile.txt");

        
        // Create a tool (FileWriter) to write to the output file 
        FileWriter out = new FileWriter(outFile);

        // Scanner reads from the input file 
        // Wrap it with BufferredReader to make it more efficient
        Scanner in = new Scanner(new BufferedReader (new FileReader(inFile)));
        // BufferedReader in = new BufferedReader (new FileReader(inFile));

        // Prepare a place (string) to store the data we read
        String input = ""; // starts empty
        String newInput; // stores each line of data we read 

        // Check if there is another line to read in the input file
        while((in.hasNextLine())) {

            // Read the nexzt line from the input file
            newInput = in.nextLine();

            // Append the new line to our storage with a line break
            input += (newInput + "\r\n");
        }

        // Write all the collected data to the output file
        out.write(input);
        
        // Close tools to free up resources
        out.close(); // Close the FileWriter
        in.close(); // Close the Scanner 
    }
}
