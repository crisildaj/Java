package Fundamentals;

import java.lang.*;
/*INSTRUCTIONS: Given an array of integers.
Return an array, where the first element is the count of positives numbers and the second element is sum of negative numbers.
0 is neither positive nor negative.
If the input is an empty array or is null, return an empty array.
 */

public class CountAndSum {
    public static void main (String[] args) {
        

    }

    public static int[] countPositivesSumNegatives(int[] input) {  
        if (input == null || input.length == 0) {
            return new int[] {0, 0};
        }

        int PositiveNumberCount = 0;
        int NegativeNumberSum = 0;
        

        
        for(int n: input) {
            if (n > 0) {
                PositiveNumberCount ++;
            }
            if (n < 0) {
                //NegativeNumberSum += n;
                NegativeNumberSum = NegativeNumberSum + n;
            }
        } 
    
        return new int[] {PositiveNumberCount, NegativeNumberSum};
}
}
        //return an array with count of positives and sum of negatives
    

