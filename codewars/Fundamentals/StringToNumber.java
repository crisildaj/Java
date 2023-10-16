package Fundamentals;

public class StringToNumber {

    public static void main (String[] args) {
        System.out.println(stringToNumber("243423"));
    }

    public static int stringToNumber(String str) {
        
        Integer number = Integer.valueOf(str);
        return number;  
        
      }
  
}
