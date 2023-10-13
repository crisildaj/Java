class ExceptionHandling {
    static void main (String[] args) {
        // Create new Person class and instantiate it
        Person a = new Person()
        a.setFirstName("John")
        a.setLastName("Doe")
        a.setAge(40)

        // Catch unchecked exception and handle it by printing a message

        try {
            // Convert a String into a Long data type
            a.getFirstName().toLong()
        }
        catch(NumberFormatException e) {
            // make sure exception caught is the exception expected
            assert e instanceof NumberFormatException
            println "Cannot convert a String into a Long"
        }
    }
}
