class Main {
    static void main(String[] args) {
        // Read numbers from files and store them in List
        List<Integer> allNumbers = readAllNumbers()
        println allNumbers

        // Find the highest number

        // Create the sum of all numbers
    }

    private static List<Integer> readAllNumbers() {
        File resourcesDir = new File("resources")
        List<Integer> allNumbers = []

        resourcesDir.eachFile {file ->
            file.eachLine {line ->
                if (line.isNumber ()) {
                    allNumbers << line.toInteger()
                }
            }
        }

        return allNumbers
    }
}