package com.mycompany.gettingobjectoriented;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Person {
    // Public instance variables  
    private String firstName;
    private String lastName;
    private Calendar birthday;

    public Person () {
        firstName = "";
        lastName = "";
        // defaults to today's date
        birthday = new GregorianCalendar();
    }


    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        //defaults to today's date
        this.birthday = new GregorianCalendar();
    }

    // Method to return full name
    public String fullName(){
        return firstName + " " + lastName;
    }

    // Method to calculate and return age
    public int age(Calendar today){

        // current date - birth datee
        return today.get(Calendar.YEAR) - birthday.get(Calendar.YEAR);
    }
}
