package com.mycompany.serialization;

import java.io.*;


public class DeSerialize {
    public static void main(String args[]) {

        // Initialise car object to null so it can be printed at the end
        Car c = null;
        
        try{

            // FileInputStream to read serialized data from the file "serialized.dat"
            FileInputStream inFile = new FileInputStream("serialized.dat");

            // ObjectInputStream to read objects from the file stream
            ObjectInputStream in = new ObjectInputStream(inFile);

            // Deserialize (Read) object from the file 
            // Cast object to expected type (Car)
            c = (Car)in.readObject();

            // Close the FileInputStream and ObjectInputStream 
            in.close();
            inFile.close();
        }

        catch (IOException e) {
            System.err.println("ERROR: IOException");
        }

        /*  When attempting to load a class dynamically, the class definition may not be found 
         * if the class definition of the object being deserialized is not available in the classpath
        */
        catch (ClassNotFoundException e) {
            System.err.println("ERROR: ClassNotFoundException");
        }

        // Print the deserialized Car Object
        // Will return null if deserialization fails 
        System.out.println(c.toString());
    }
}
