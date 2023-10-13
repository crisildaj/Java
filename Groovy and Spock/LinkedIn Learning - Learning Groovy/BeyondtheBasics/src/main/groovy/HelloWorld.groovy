class HelloWorld {
    static void main(String[] args) {
        Person a = new Person()
        a.setFirstName("John")
        a.setLastName("Doe")
        a.setAge(40)

        assert a.toString() == "Person(John, Doe, 40)"
        assert a.equals(a)
        assert !a.equals(new Person(firstName: "Mary", lastName: "Hill", age: 30))
        assert new Person("Mary", "Hill", 30).toString() == "Person(Mary, Hill, 30)"
    }
}