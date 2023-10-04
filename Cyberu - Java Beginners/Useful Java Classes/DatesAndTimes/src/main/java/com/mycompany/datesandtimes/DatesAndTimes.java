
package com.mycompany.datesandtimes;

import java.util.*;

public class DatesAndTimes {

    public static void main(String[] args) {

        // current date
        Calendar now = new GregorianCalendar(); //Calendar.getInstance()



        /*  The Unix epoch (1st January 1970 - 00:00:00 UTC)
         * - the point in tiem when the clock started ticking for Unix-like operating systems 
         * - used as a reference point in time in computer systems and programming 
         */
        // now.setTimeInMillis(0);
        // System.out.println(now.getTimeInMillis());

        // Months are indexed --> January = 0, February = 1, etc. 
        System.out.println(now.get(Calendar.MONTH) + 1);

        // Print the date
        System.out.println(now.get(Calendar.DAY_OF_MONTH));

        // Print the year 
        System.out.println(now.get(Calendar.YEAR));
    }
}
