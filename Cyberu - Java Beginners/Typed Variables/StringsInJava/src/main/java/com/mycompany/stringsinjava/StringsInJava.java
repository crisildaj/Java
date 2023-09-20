package com.mycompany.stringsinjava;

public class StringsInJava {

    public static void main(String[] args) {
        //char is a primitive type
        //String is a class type
        char c = 'c';
        String s1 = "stringone"; 
        String s2 = "stringtwo";
        String s3 = s1 + s2 + "LIT";
        
        //this modifies s3 permanently
        s3 = s3.toUpperCase();
        
        //this function does not modify s3 permanently
        System.out.println(s3.toUpperCase());
        
        // replaces g with o
        System.out.println(s3.replace('G', 'O'));
        
        System.out.println(s3);
        
        // to print out double quotation marks use black slash
        // to print out black slash preface it with a black slash
        String s = "The program says: \\ \"Hello World\"";
        System.out.println(s);
    }
}
