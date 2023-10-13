class Main {
    static void main (String[] args) {
        // Create new Person class and instantiate it
        Person a = new Person()
        a.setFirstName("John")
        a.setLastName("Doe")
        a.setAge(40)

        // Print the full name and age of the Person instance
        println a.getFullName()
        println a.getAge()

        // Identify if Person is middle-aged using a conditional
        if (a.getAge() >= 45 && a.getAge() <= 65 ) {
            println a.getFullName() + " is middle-aged"
        }
        else {
            println a.getFullName() + " is " + a.getAge() + " years old"
        }

        // Define a list of Persons
        def personList = [a, new Person(firstName: "Mary", lastName: "Hill", age: 21 )]

        // Iterate over Person instances in list
        for (Person p : personList) {
            println p.getFullName()
        }
    }
}