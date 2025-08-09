import java.util.Scanner;

// Interface for calculator operations
interface Operations {
    void add(double a, double b);
    void subtract(double a, double b);
    void multiply(double a, double b);
    void divide(double a, double b);
}

// Parent class for taking user input
class UserInput {
    protected double num1, num2;

    public void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        num2 = sc.nextDouble();
    }
}

// Child class: Hybrid Inheritance (class + interface)
class Calculator extends UserInput implements Operations {

    @Override
    public void add(double a, double b) {
        System.out.println("Addition: " + (a + b));
    }

    @Override
    public void subtract(double a, double b) {
        System.out.println("Subtraction: " + (a - b));
    }

    @Override
    public void multiply(double a, double b) {
        System.out.println("Multiplication: " + (a * b));
    }

    @Override
    public void divide(double a, double b) {
        if (b != 0)
            System.out.println("Division: " + (a / b));
        else
            System.out.println("Error: Division by zero not allowed.");
    }
}

// Main class
public class BasicCalculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.getInput();
        calc.add(calc.num1, calc.num2);
        calc.subtract(calc.num1, calc.num2);
        calc.multiply(calc.num1, calc.num2);
        calc.divide(calc.num1, calc.num2);
    }
}