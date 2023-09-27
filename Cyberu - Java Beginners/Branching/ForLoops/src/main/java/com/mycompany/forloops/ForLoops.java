package com.mycompany.forloops;

public class ForLoops {

    public static void main(String[] args) {
        /*int i = 1;
        while(i <= 100)
        {
            System.out.println(i);
            i++;
        } */
        
        // In this 'for' loop, we have three main components:
        // 1. Initialization: 'int i = 1;' - Initialize the loop control variable 'i' to 1.
        // 2. Conditional Statement: 'i <= 100;' - Check if 'i' is less than or equal to 100.
        // 3. Increment: 'i++' - Increment 'i' by 1 after each iteration.

        // The loop will run as long as 'i' is less than or equal to 100.
        for(int i=1; i <= 100; i++)
        {
            // Within the loop, we print the current value of 'i' to the console.
            System.out.println(i);
        }
    }
}
