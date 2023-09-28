package com.mycompany.echo;

import java.util.*;


public class OddEven {
    
    public static void main(String[] args){

        Scanner reader = new Scanner(System.in);

        ArrayList<Integer> odd = new ArrayList<Integer>();
        ArrayList<Integer> even = new ArrayList<Integer>();

        
      
        while(true) {
            try{
                int input = reader.nextInt();

                if (input==0) {
                break;
                }

                if (input % 2 == 0) {
                even.add(input);
                }

                else {
                odd.add(input);
            }
            }
            catch (Exception e) {
                System.out.println("Please enter an integer!");  
                reader.nextLine();  
            }
    

            

            
        }
        System.out.print("Odd numbers: ");
        System.out.println(odd.toString());

        System.out.print("Even numbers: ");
        System.out.println(even.toString());

        reader.close();
    }

}
