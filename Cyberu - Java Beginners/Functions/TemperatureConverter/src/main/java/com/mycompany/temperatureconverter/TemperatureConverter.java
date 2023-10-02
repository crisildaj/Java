package com.mycompany.temperatureconverter;

import java.util.*;

// F to C: ((t-32.0f)*5.0f)/9.0f
// C to K: t+273.15f
// K to F: (((t-273.15f)*9.0f)/5.0f)+32.0f

//f --> float literal (i.e. 273.15f = 273.15)

public class TemperatureConverter {
    public static void main(String[] args) {

        // Scanner object for user input 
        Scanner reader = new Scanner(System.in);

        // Declaring variables to store input and output types
        char inputType; //input temperature type (F/C/K)
        char outputType; //input temperature type (F/C/K)

        // Declaring variables to store temparature value
        float inputValue;
        float returnValue; // converted temperature value
        
        // Prompt user for input type (F/C/K)
        System.out.print("Input type (F/C/K): ");
        inputType = reader.next().charAt(0);

        // Prompt user for output type (F/C/K)
        System.out.print("Output type (F/C/K): ");
        outputType = reader.next().charAt(0);


        System.out.print("Temperature: ");
        inputValue = reader.nextFloat();
		
        // Convert the input temperature to Celsius as a commonn intermediate step 
		switch(inputType) {
            case 'F': 
                inputValue = fToC(inputValue); // Convert Fahrenheit to Celsius (F -> C)
                break;

            case 'C':
                // No conversion needed for Celsius
                break;

            case 'K':
                inputValue = fToC(kToF(inputValue)); //Convert Kelvin to Celsius (K -> F then F -> C )
                break;

            default:
                System.exit(1); //Exit the program with an error code if input is invalid
        }


        // Convert the intermediate Celsius value to the desired output scale
        switch(outputType) {
            case 'F':
                inputValue = kToF(cToK(inputValue)); //Convert Celsius to Fahrenheit (C -> K then K -> F)
                break;
            
            case 'C':
                // No conversion needed for Celsius
                break;

            case 'K':
                inputValue = cToK(inputValue); //Convert Celsius to Fahrenheit (C -> K)

            default:
                System.exit(1); //Exit the program with an error code if input is invalid
        }

            // Print the converted temperature value
            System.out.println(inputValue);

        }

    public static float fToC(float fVal) {
        return ((fVal-32.0f)*5.0f)/9.0f;
    }

    public static float kToF(float kVal) {
        return (((kVal-273.15f)*9.0f)/5.0f)+32.0f;
    }

    public static float cToK(float cVal) {
        return cVal+273.15f;
    }

   
}