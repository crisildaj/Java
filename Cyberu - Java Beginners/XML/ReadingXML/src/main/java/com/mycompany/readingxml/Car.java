package com.mycompany.readingxml;

public class Car {
    public String vin;
    public String make;
    public String model;
    public int year;
    public String color;

    // default constructor to initialise instance variables to default values (e.g. 0 or null)
    public Car(){

    }

    @Override
    public String toString() {
        return String.format("%d %s %s %s, vin:%s",
        year, color, make, model, vin);
    }
    
}
