package com.mycompany.serialization;

import java.io.*;

// Serialization converts an object's state (field and data) into binary or other easily storable format 
// PURPOSE = saving it to a file, transmitting it over a network
public class Serialize {

        public static void main (String args[]) {
        // Instantiate new car object
        Car c = new Car("JKSJDF798", "Nissan", "Altima", "Green", 2000);
        
        // surround with try/catch block because dealing with external files will most likely throw exceptions
        try{
            //serialized objects = binary info --> use FileOutputStream 
            // writes serialized data to a file called "serialized.dat"
            FileOutputStream outFile = new FileOutputStream("serialized.dat");

            // ObjectOutputStream --> more specialised stream for serialising objects
            // construct an ObjectOutputStream by wrapping it around the exisitng FileOutputStream
            // writes objects to the file stream
            ObjectOutputStream out = new ObjectOutputStream(outFile);

            // Serialize (Write) object to the file
            out.writeObject(c);

            // Close the FileOutputStream and ObjectOutputStream
            out.close();
            outFile.close();

            System.out.println("Object has been serialized.");
        }

        // Handle IO Exception
        catch (IOException e) {
            System.err.println("ERROR: IOException");
        }
    }
} 

