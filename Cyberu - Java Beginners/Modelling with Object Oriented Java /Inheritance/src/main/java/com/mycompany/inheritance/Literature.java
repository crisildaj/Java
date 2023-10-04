package com.mycompany.inheritance;

// abstract --> class cannot be instantiated on its own but serves as a blueprint for other classes  
public abstract class Literature {

    // Instance variables to store title and author
    protected String title;
    protected String author;

    /* private --> only accessible within the same class dedclaration
       protected --> acessible within the same class, subclasses and same package
       public --> accessible from anywhere in the same codebase */


/*Constructor to initialise title and author - constructor is not essential for abstract classes
 * but then you can't make references to the super class (Literature in this case)*/
public Literature(String title, String author) {
    this.title = title;
    this.author = author;
}

// Method to print title and author
public void Print() {
    System.out.println(title);
    System.out.println("\tWritten By: " + author);
}

}