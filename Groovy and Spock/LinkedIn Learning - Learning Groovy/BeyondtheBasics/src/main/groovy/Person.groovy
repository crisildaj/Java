import groovy.transform.Canonical
import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString
import groovy.transform.TupleConstructor

// Declare convenience annotations on class-level
@Canonical // Combines @ToString, @EqualsAndHashCode, and @TupleConstructor
//@ToString
//@EqualsAndHashCode
//@TupleConstructor
class Person {
    // Declare instance variables
    String firstName
    String lastName
    int age

//    // Default constructor
//    Person() {
//    }
//
//    // Constructor with three parameters
//    Person(String firstName, String lastName, int age) {
//        // Initialise instance variables
//        this.firstName = firstName
//        this.lastName = lastName
//        this.age = age
//    }
//
//    // Override the equals method to compare two Person objects for equality
//    @Override - @TupleConstructor
//    boolean equals(o) {
//
//        // if the current object is the same as the argument object
//        if (this.is(o)) {
//            return true
//        }
//
//        // if the argument object is an instance of the Person class
//        if (!(o instanceof Person)) {
//            return false
//        }
//
//        // Cast the argument object to a Person object
//        Person person = (Person) o
//
//        // Comparing the age, firstName and lastName of the two objects
//        if (age != person.age) {
//            return false
//        }
//        if (firstName != person.firstName) {
//            return false
//        }
//        if (lastName != person.lastName) {
//            return false
//        }
//
//        // If all checks pass, the objects are considered equal
//        return true
//    }
//
//    // Override the hashCode method to generate a hash code for a Person object
//    /* hashCode --> produces a unique integer value for an object
//        The hashCode method is used in conjunction with the 'equals' method:
//            - if two objects are equal according to the 'equals' method, their hash codes should also be equal according to the hashCode method */
//    @Override - -@EqualsAndHashCode
//    int hashCode() {
//        // Initialise a result variable
//        int result
//
//        // Calculate the hash code based on firstName, lastName and age
//        result = (firstName != null ? firstName.hashCode() : 0)
//        result = 31 * result + (lastName != null ? lastName.hashCode() : 0)
//        result = 31 * result + age
//        return result
//    }

    // Override the toString method to generate a string representation of a Person object
//    @Override -@ToString
//    String toString() {
//
//        // Create a string containing the first name, last name, and age
//        return "Person(" +
//                firstName + ", " +
//                lastName + ", " +
//                age +
//                ")"
//    }
}