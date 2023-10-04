package com.mycompany.inheritance;

public class Inheritance {
    public static void main(String[] args) {

        //Book object
        Book a = new Book(
                "The Lord Of The Rings", 
                "J.R.R. Tolkein",
                "George Allen and Unwin", 
                "Fantasy");

        // Poem object
        Poem b = new Poem(
                "The Iliad",
                "Homer",
                "Dactylic Hexameter");

        
        //Literature object
        // Literature c = new Literature ("Java", "Zach");
        // cannot be instantiated because the Literature class is abstract

        // Array of Literature objects with a length of 5
        Literature[] lits = new Literature[5];
        lits[0] = a;
        lits [1] = b;
        lits [2] = a;
        lits [3] = b;
        lits [4] = a;
        
        // Loop through array and call the Print() method for each element 
        for (int i = 0; i < lits.length; i++) {
            lits[i].Print();
        }
    }
}