/* Closure = anonymous function used to encapsulate behaviour
* purpose = to write shorter and more concise code
*  + essential to using and writing domain specific languages  */

class Closures {
    static void main(String[] args) {
        Person a = new Person()
        a.setFirstName("John")
        a.setLastName("Doe")
        a.setAge(40)

        // Create Closure that prints String representation of a person
        Closure personToString = {Person person -> println person.toString() }
//        personToString(a)

        // Pass Closure to a method and execute it
        handlePerson(personToString, a)

        // Create Closure that prints full name of a person
        Closure personFullName = {Person person -> println person.firstName + " " + person.lastName}

        // Pass Closure to a method and execute it
        handlePerson(personFullName, a)

    }

    static void handlePerson (Closure c, Person p) {
        if (p == null) {
            throw new RuntimeException("A person instance cannot be null")
        }
        c(p)
    }
}