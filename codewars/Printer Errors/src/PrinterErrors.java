public class PrinterErrors {

    public static String printerError(String s) {
        String accepted = "abcdefghijklm";
        char[] ListOfChars = s.toCharArray();

        int unacceptedCount = 0;

        for (char i : ListOfChars) {
            if (!accepted.contains(String.valueOf(i))) {
            unacceptedCount ++; 
            }

        }

        return unacceptedCount + "/" + ListOfChars.length;
            
        
        
    }

    public static void main (String args[]) {
        String a = "aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz";
        System.out.println(printerError(a));
    } }

