class PrinterErrors {
    static String printerError(s) {
        String accepted = "abcdefghijklm"
        char[] ListOfChars = s.toCharArray();

        int unacceptedCount = 0;

        for (char i : ListOfChars) {
            if (!accepted.contains(String.valueOf(i))) {
                unacceptedCount ++;
            }

        }

        return unacceptedCount + "/" + ListOfChars.length;
    }
}
