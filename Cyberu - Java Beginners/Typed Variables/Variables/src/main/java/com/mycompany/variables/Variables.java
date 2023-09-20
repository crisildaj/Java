package com.mycompany.variables;

public class Variables {

    public static void main(String[] args) {
        // long can store larger numbers than int
        long x;
        
        x = 2147483647;
        x++;
        
        //largest number Java can store: 2147483647
        //smallest number Java can store: -2147483648
        System.out.println(x);
    }
}
