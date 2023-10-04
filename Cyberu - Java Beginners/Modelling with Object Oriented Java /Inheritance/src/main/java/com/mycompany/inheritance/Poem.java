package com.mycompany.inheritance;

/* extends --> 'is a' relationship 
     A poem is a type of Literature
    Sub-class Poem inherits from the Super class literature */
public class Poem extends Literature{
    // Additional instance variable to store the style of the poem
    private String style;
    
    // Constructor to initialise title, author and style
    public Poem(String title, String author, String style) {
        //Call constructor of superclass to initialise title and author
        super(title, author);
        this.style = style;
    }
    
    // Override the Print method from the superclass so that style gets printed as well
    @Override public void Print() {
       // Call the print method of the superclass to print title and author 
       super.Print();
       System.out.println("\tIn The Style Of: " + style);
    }
}
