package com.mycompany.echo;

import java.util.*;


public class OddEven {
    
    public static void main(String[] args){

        //Scanner object to read input from console
        Scanner reader = new Scanner(System.in);

        // list to store odd numbers
        ArrayList<Integer> odd = new ArrayList<Integer>();

        // list to store even numbers
        ArrayList<Integer> even = new ArrayList<Integer>();

        
      
        while(true) {
            try{
                System.out.println("Enter an integer (enter 0 to quit/ see output):");
                //try reading the input as an integer
                int input = reader.nextInt();

                if (input==0) {
                break;
                }
                if (odd.contains(input) || even.contains(input)){
                    System.out.println("This number has already been entered! \n");
                }
                else {
                    if (input % 2 == 0) {
                        even.add(input);
                        System.out.println("Adding to the list of even numbers... \n");
                }

                    else {
                        odd.add(input);
                        System.out.println("Adding to the list of odd numbers... \n");
            }
                }
                
            }
            catch (InputMismatchException e) {
                System.out.println("Please enter an integer! \n");  
                reader.nextLine();  
            }
        

            

            
        }
        Collections.sort(odd);
        Collections.sort(even);

        System.out.print("\nOdd numbers: ");
        System.out.println(odd.toString());

        System.out.print("Even numbers: ");
        System.out.println(even.toString());

        reader.close();
    }

}
