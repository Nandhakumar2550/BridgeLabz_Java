package inbuild.level2;
import java.util.Scanner;
public class BasicCalculator {
    public static double add(double a, double b) { return a + b; }
    public static double subtract(double a, double b) { return a - b; }
    public static double multiply(double a, double b) { return a * b; }
    public static double divide(double a, double b) { return a / b; }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

        System.out.print("Choose operation (+ - * /): ");
        char op = input.next().charAt(0);

        switch (op) {
            case '+': System.out.println(add(num1, num2)); break;
            case '-': System.out.println(subtract(num1, num2)); break;
            case '*': System.out.println(multiply(num1, num2)); break;
            case '/': System.out.println(divide(num1, num2)); break;
            default: System.out.println("Invalid operation");
        }
    }
}
