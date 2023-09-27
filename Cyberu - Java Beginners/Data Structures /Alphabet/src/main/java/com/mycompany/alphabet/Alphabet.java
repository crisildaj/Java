
package com.mycompany.alphabet;

import java.util.Arrays;

public class Alphabet {

    public static void main(String[] args) {
        
        // create a character array of length 26 to store the alphabet
        char[] alpha = new char[26];
    
        //iterate through the array
        for(int i = 0; i < 26; i++) {

            //97 = a (ASCII table)
            alpha[i] = (char) (97 + i);
            // Calculate the ASCII value of 'a' (97) and add 'i' to it to get the ASCII value
            // of the current character in the loop.
            // Cast this ASCII value to a char to get the corresponding character.

        }



        System.out.println(Arrays.toString(alpha));
    }
}
