class Drop {
    static void main (String[] args) {
        // Create new Person class and instantiate it
        Person a = new Person()
        a.setFirstName("Johnny")
        a.setLastName("Doe")
        a.setAge(40)

        // Use the dropRight method to remove 2 characters from the end
        println a.getFirstName().dropRight(2)
    }

}
