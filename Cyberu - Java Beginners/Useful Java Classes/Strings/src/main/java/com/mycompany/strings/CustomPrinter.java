package com.mycompany.strings;

public class CustomPrinter {
    private String formatString;


    
    // Constructor
    public CustomPrinter (String format) {
        //assigns the parameter format to the formatString variable
        // don't need to use the this keyword because the variable names are distinct
        formatString = format;
    } 

    public void println(String input) {
        String formatted = String.format(formatString, input);
        System.out.println(formatted);
    }
}
