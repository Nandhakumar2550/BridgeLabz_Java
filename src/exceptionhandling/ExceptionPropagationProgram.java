package exceptionhandling;

// propagation example
public class ExceptionPropagationProgram {

    static void method1() {
        int x = 10 / 0; // generating ArithmeticException (division by zero)
    }

    static void method2() {
        method1(); // calling method1, exception propagates from here
    }

    public static void main(String[] args) {

        try {
            method2(); // calling method2, exception further propagates to main

        } catch(Exception e) {
            System.out.println("Handled exception in main"); // handling propagated exception
        }
    }
}