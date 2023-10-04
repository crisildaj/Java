package com.mycompany.gettingobjectoriented;

import java.util.*;

public class GettingObjectOriented {
    public static void main(String[] args) {
        
        // Creating an instance of the Person class and initialising it 
        Person john = new Person("John", "Doe" );
        
        /* The followig lines will cause the program to not compile because the instances are private in the Person class */
        // john.firstName = "John";
        // john.lastName = "Doe";
        // john.birthday = new GregorianCalendar(1988, 1, 5);

        
        // Current age
        // System.out.println(john.age(new GregorianCalendar()));

        System.out.println(
            "Hello my name is " + john.fullName() +
            ". I am " + john.age (new GregorianCalendar()) + " years old.");
        

       
    }

    
}
