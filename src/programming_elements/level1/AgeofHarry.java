package programming_elements.level1;

public class AgeofHarry {

    public static void main(String args[]){

        String name = "Harry"; // Declares a variable 'name' of type String and assigns value "Harry"

        int birthyear = 2000; // Declares an integer variable 'birthyear' and assigns value 2000

        int currentyear = 2024; // Declares an integer variable 'currentyear' and assigns value 2024

        int age = currentyear - birthyear; // Calculates age by subtracting birthyear from currentyear

        System.out.print(name + "'s age in " + currentyear + " is " + age);
        // Prints the final output in one line
    }
}