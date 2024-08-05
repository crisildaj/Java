class Negative {
    static makeNegative(number) {
        if (number > 0) {
            return (number * -1)
        } else {
            return number
        }
    }

    static void main (String args[]) {
        int i = 57
        println makeNegative(i)
    }
}

