class ReadFile {
    static void main (String[] args) {
        Person a = new Person()

        // Read full contents of file
        File john = new File("john-doe.txt")

        // read the file using the getText method
        println john.getText("UTF-8")

        // Iterate over each line of file
        john.eachLine {line, i ->

            // Check line number and set corresponding attribute
            if (i == 1) {
                a.setFirstName(line)
            } else if (i == 2) {
                a.setLastName(line)
            } else if (i == 3) {
                a.setAge(line.toInteger())

                // if there are more than 3 lines throw a RuntimeException
            } else {
                throw new RuntimeException("A person text file should only have 3 lines")
            }

        }
            // Print the person object
            println a

    }
}
