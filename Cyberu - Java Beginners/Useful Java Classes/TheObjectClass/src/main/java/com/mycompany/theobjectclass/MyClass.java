package com.mycompany.theobjectclass;

public class MyClass {
    // Declare an instance variable of type String called value
    public String value;

    // Constructor takes a String parameter and initalises the value field
    public MyClass(String value) {
        this.value = value;
        System.out.println("A MyClass object was created with value: " + value);
    }

    // A method that is called on a MyClass Object with a specific value
    public void MyMethod() {
        System.out.println("MyMethod was called on a MyClass object with value: " + value);
    }

    // Override the equals method 
    @Override
    public boolean equals(Object obj) {
        if(obj == null)
            return false;
        
        if(!(obj instanceof MyClass))
            return false;

        return value.equals((MyClass)obj);
    }
}
