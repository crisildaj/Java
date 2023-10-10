package Fundamentals;

/*Complete the function so that it finds the average of the three scores passed to it and returns the letter value associated with that grade.

Numerical Score	Letter Grade
90 <= score <= 100	'A'
80 <= score < 90	'B'
70 <= score < 80	'C'
60 <= score < 70	'D'
0 <= score < 60	'F'
Tested values are all between 0 and 100. Theres is no need to check for negative values 
or values greater than 100. /* */

public class GradeBook {
    public static char getGrade(int s1, int s2, int s3) {
        int avgGrade = (s1 + s2 + s3)/ 3;
        char grade;

        if (avgGrade >= 90 ) {
            grade = 'A';
        }

        else if (avgGrade >= 80 ) {
            grade = 'B';
        }

        else if (avgGrade >= 70 ) {
            grade = 'C';
        }

        else if (avgGrade >= 60 ) {
            grade = 'D';
        }

        else {
            grade = 'F';
        }

        return grade;
        
        }
    

        
    }


