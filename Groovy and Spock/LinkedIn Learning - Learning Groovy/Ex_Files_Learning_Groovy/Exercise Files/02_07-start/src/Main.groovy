class Main {
    static void main(String[] args) {

        Calculator problem = new Calculator()

        assert problem.add (5, 4) == 9
        assert problem.subtract (5, 4) == 1
        assert problem.multiply (5, 4) == 20
        assert problem.divide(5, 4) == 1.25

        try {
            problem.divide(7, 0)
        } catch (RuntimeException e) {
            assert e.getMessage() == "Cannot divide by zero"}








    }
}
