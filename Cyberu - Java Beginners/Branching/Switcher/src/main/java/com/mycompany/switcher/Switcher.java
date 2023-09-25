package com.mycompany.switcher;


public class Switcher {

    public static void main(String[] args) {
        int x = 5;
        
        switch(x) 
        {
            case 1: case 5: case 7:
                System.out.println("RED");
                break;
            case 2:
                System.out.println("BLUE");
                break;
            case 3:
                System.out.println("GREE ");
                break;
            default:
                System.out.println("NONE");
        }
        
        
        
//        if (x == 1) 
//        {
//            System.out.println("RED");
//        }
//        if (x == 2) 
//        {
//            System.out.println("BLUE");
//        }
//        if (x == 3) 
//        {
//            System.out.println("GREEN");
//        }
//        if ((x != 1) && (x != 2) && (x !=3)) 
//        {
//            System.out.println("NONE");
//        }
    }
}
