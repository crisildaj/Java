class WriteFile {
    static void main (String[] args) {

        // Create a file and populate contents
        File newPerson = new File("mary-hill.txt")
        newPerson.withWriter('UTF-8') {writer ->
            writer.writeLine("Mary")
            writer.writeLine("Hill")
            writer.writeLine("30")
        }

        // Appending contents to a file
        newPerson.append("1")
        newPerson << "2"

        // Serialising an object to a file
        Person c = new Person("Thomas", "Marks")
        File binfile = new File("thomas-marks.bin")
        binfile.withObjectOutputStream {out ->
            out.writeObject(c)
        }
    }
}
