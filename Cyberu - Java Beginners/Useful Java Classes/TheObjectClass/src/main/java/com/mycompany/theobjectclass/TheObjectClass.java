package com.mycompany.theobjectclass;

public class TheObjectClass {

    public static void main(String[] args) {
        //Two instances of MyClass
        // Class instance = new Class(parameter)
        MyClass object1 = new MyClass("abcdefg");
        MyClass object2 = new MyClass("abcdefg");

        // Call MyMethod on both objects
        // instance.method()
        object1.MyMethod();
        object2.MyMethod();

        System.out.println("The objects are the same: " + (object1 == object2));
        System.out.println("The objects are equal: " + object1.equals(object2));
    }
}
