package com.mycompany.guis;

public class OverrideDemo {
    public static void main (String[] args) {
       
        Parent parent = new Parent();
        Child child = new Child();

    parent.doSomething();
    child.doSomething();
    }

    

    
}


// public class Parent {
//     public void doSomething() {
//         System.out.println("Parent doing something");
//     }
// }

// public class Child extends Parent {
//     @Override
//     public void doSomething() {
//         System.out.println("Child doing something");

//     }
// }

