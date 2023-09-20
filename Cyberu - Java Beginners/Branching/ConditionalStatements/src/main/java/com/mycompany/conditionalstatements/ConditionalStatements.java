
package com.mycompany.conditionalstatements;

import java.util.*;

public class ConditionalStatements {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Input now: ");
        int input = reader.nextInt ();
        //String input = reader.next();
        //System.out.println(input); 
    
        //other operators: ==, !=, 
        if(input > 10)
        {
            System.out.println("MORE!");
        }
        
        else
        {
            System.out.println("LESS!");  
      }
    }}
    