public class Calculator {
    public static void main (String args[]) {
        System.out.println(calculator(2, '+', 89));
    }
    
    public static int calculator(int num1, char operator, int num2) {
        int result = 0;

		switch (operator) {
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero");
                }
                break;

            default:
                System.out.println("Invalid operator");

        }

        return result;
    }
}
