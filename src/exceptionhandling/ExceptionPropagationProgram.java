package exceptionhandling;

// propagation example
public class ExceptionPropagationProgram {

    static void method1() {
        int x = 10 / 0; // exception
    }

    static void method2() {
        method1(); // calling method1
    }

    public static void main(String[] args) {

        try {
            method2();

        } catch(Exception e) {
            System.out.println("Handled exception in main");
        }
    }
}
