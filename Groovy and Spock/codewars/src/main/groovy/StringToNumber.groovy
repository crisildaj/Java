class StringToNumber {
    static int stringToNumber(String s) {
        return s.toInteger()
    }

    static void main (String[] args) {
        String s = "123456"
        String t = "67"
        String h = "5678"
        println stringToNumber(s)
        println stringToNumber(t)
        println stringToNumber(h)
    }

}
