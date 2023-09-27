package com.mycompany.unittesting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

// import org.junit.Before;
// import org.junit.Test;

public class Demo2Test {
    
    @Test 
    
    // name of test
    public void mainTestInput1() {

        //Junit will enter 1 as a user and produce the output from that
        String input = "1\n";

        // Set up an input stream with predefined input values
        ByteArrayInputStream in =
                //getBytes() will return byte array for the string
                new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        //Redirect the standard output to capture console output
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        //invoke main method
        String[] args = {};
        Demo2.main(args);

        //expected output
        String consoleOutput = "Enter the radius: " + System.getProperty("line.separator");
        consoleOutput += "For a circle with radius 1.0," + System.getProperty("line.separator");
        consoleOutput += " the circumference is 6.283185307179586" + System.getProperty("line.separator");
        consoleOutput += " and the area is 3.141592653589793." + System.getProperty("line.separator");

        assertEquals(consoleOutput, out.toString());
    }

    //radius 3, circum 18.849555921539, area 28.274333882308
    @Test 
    
    // name of test
    public void mainTestInput3() {

        //Junit will enter 3 as a user and produce the output from that
        String input = "3\n";

        // Set up an input stream with predefined input values
        ByteArrayInputStream in =
                //getBytes() will return byte array for the string
                new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        //Redirect the standard output to capture console output
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        //invoke main method
        String[] args = {};
        Demo2.main(args);

        //expected output - 15 decimals of precision required in Java
        String consoleOutput = "Enter the radius: " + System.getProperty("line.separator");
        consoleOutput += "For a circle with radius 3.0," + System.getProperty("line.separator");
        consoleOutput += " the circumference is 18.84955592153876" + System.getProperty("line.separator");
        consoleOutput += " and the area is 28.274333882308138." + System.getProperty("line.separator");

        assertEquals(consoleOutput, out.toString());
    }

    //radius 0, 0, 0

    //radius -1, error "radius must be positive"

    //radius "abc", error "radius must be a number"

}   
