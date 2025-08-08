import java.util.Scanner;

class Calculator {
    public double performOperation(double a, double b, String operation) {
        if (operation.equals("+")) {
            return a + b;
        } else if (operation.equals("-")) {
            return a - b;
        } else if (operation.equals("*")) {
            return a * b;
        } else if (operation.equals("/")) {
            if (b == 0) {
                System.out.println("Error: Cannot divide by zero");
                System.exit(0);
            }
            return a / b;
        } else {
            System.out.println("Invalid operation");
            System.exit(0);
            return 0; // This line will never be reached
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.print("Enter value for a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter value for b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter type of operation (+, -, *, /): ");
        String operation = scanner.next();

        double result = calculator.performOperation(a, b, operation);
        System.out.println("Result: " + result);

        scanner.close();
    }
}
