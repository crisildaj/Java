package com.mycompany.conditionalstatements;

import java.util.*;

public class ConditionalStatements2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String input = reader.next();

        if(input.equals("password"))
        {
            System.out.println("YES");
        }

        else{
            System.out.println("NO");
        }
    }
}

