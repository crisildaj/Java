package com.mycompany.conditionalstatements;

//Import the java.util package, which contains the Scanner class
import java.util.*;

public class ConditionalStatements2 {
    public static void main(String[] args) {

        //Create a Scanner object named 'reader' to read user input from the console
        Scanner reader = new Scanner(System.in);

        // Prompt the user to enter a string and read it into the 'input' variable.
        String input = reader.next();


        //Check if the value stored in 'input' is equal to the string "password".
        if(input.equals("password"))
        {
            System.out.println("YES");
        }

        else{
            System.out.println("NO");
        }
    }
}

