class Collections {
    static void main (String[] args) {
        Person a = new Person("John", "Doe", 40)
        Person b = new Person("Mary", "Hill", 30)
        Person c = new Person("Thomas", "Marks", 21)

        // Create a new list of persons
        def allPersons = [a, b, c]

        // Querying Collections - verifying the properties of created list
        assert allPersons instanceof List
        assert allPersons.size() == 3
        assert allPersons[2] == c

        // Iterate over elements
        allPersons.each{
            println it
        }

        // Iterate over elements using an index
        allPersons.eachWithIndex{ Person entry, int i ->
            println i + ": " + entry
        }

        // Filtering a specific element
        println (allPersons.find {it.lastName == "Hill"} == b)
        // add println statement in front to see boolean value printed to console

        // Transforming elements into something else
        allPersons.collect {it.age <= 30 } == [false, true, true]

        // Sorting elements based on a criterion
        allPersons.sort {it.age} == [c, b, a]

    }

}
