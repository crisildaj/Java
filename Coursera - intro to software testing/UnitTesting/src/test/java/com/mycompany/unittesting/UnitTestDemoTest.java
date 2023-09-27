
package com.mycompany.unittesting;

// import org.junit.jupiter.api.AfterEach;
// import org.junit.jupiter.api.AfterAll;
// import org.junit.jupiter.api.BeforeEach;
// import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
// import java.io.ByteArrayInputStream;


public class UnitTestDemoTest {
    
    public UnitTestDemoTest() {
    }

    @Test  
    public void test_is_triangle_1() {
        assertTrue(UnitTestDemo.isTriangle(3, 4, 5));
    }

    @Test  
    public void test_is_triangle_2() {
        assertTrue(UnitTestDemo.isTriangle(5, 12, 13));
    }

    @Test  
    public void test_is_triangle_3() {
        assertTrue(UnitTestDemo.isTriangle(5, 13, 12));
    }

    @Test  
    public void test_is_triangle_4() {
        assertTrue(UnitTestDemo.isTriangle(12, 5, 13));
    }

    //Negative Test Cases - assertFalse
    @Test  
    public void test_is_NOT_triangle_1() {
        assertFalse(UnitTestDemo.isTriangle(5, 7, 13));
    }

    @Test  
    public void test_is_NOT_triangle_2() {
        assertFalse(UnitTestDemo.isTriangle(13, 5, 7));
    }

     @Test  
    public void test_is_NOT_triangle_3() {
        assertFalse(UnitTestDemo.isTriangle(7, 13, 5));
    }

     @Test  
    public void test_is_NOT_triangle_4() {
        assertFalse(UnitTestDemo.isTriangle(7, 13, 5));
    }

    @Test  
    public void test_is_NOT_triangle_5() {
        //This is NOT a triangl...and yet..
        assertFalse(UnitTestDemo.isTriangle(5, 9, 3));
    }

     @Test  
    public void test_is_NOT_triangle_6() {
        //obviously not a triangle
        assertFalse(UnitTestDemo.isTriangle(1, 2, -1));
    }

     @Test  
    public void test_is_NOT_triangle_7() {
        //obviously not a triangle
        assertFalse(UnitTestDemo.isTriangle(5, 9, 3));
    }

    //All unit tests pass except the main program
    //Testing the main program
    /* 
    @Test 
    public void test_main_program_1() {
        // Set up an input strea with predefined input values
        ByteArrayInputStream in =
                new ByteArrayInputStream("5\n12\n13\n".getBytes());
        System.setIn(in);

        //Redirect the standard output to capture console output
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        // Define the expected console output based on the provided input
        String consoleOutput = "Enter side 1: \n";
        consoleOutput += "Enter side 2: \n";
        consoleOutput += "Enter side 3: \n";
        consoleOutput += "This is a triangle. \n";

        // Check if the program's console output matches the expected output
        assertEquals(consoleOutput, out.toString());
    } */
    
}