package exceptionhandling;

import java.util.*;

// finally execution
public class FinallyBlockProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(a / b);

        } catch(ArithmeticException e) {
            System.out.println("Cannot divide by zero");

        } finally {
            // always executes
            System.out.println("Operation completed");
        }
    }
}
