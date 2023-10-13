class ConvenienceAnnotations {

    static void main(String[] args) {
        // Create new Person class and instantiate it
        Person a = new Person()
        a.setFirstName("John")
        a.setLastName("Doe")
        a.setAge(40)

        assert a.toString() == "Person(John, Doe, 40)"
        assert a.equals(a)

        // Create a new Person object wuth different properties and assert that its n

        // Assert that the output of the toString() method for a different Person object matches the expected string
        assert new Person(firstName: "Mary", lastName: "Hill", age: 30).toString() == "Person(Mary, Hill, 30)"

    }

}
