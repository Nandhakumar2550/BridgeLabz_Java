package programming_elements.level1;


public class AverageMarkofSam {


    public static void main(String args[]){


        String name = "Sam";
        // Declares a String variable 'name' and assigns value "Sam"

        double mathsmark = 94;
        // Declares a double variable for Maths mark

        double physicsmark = 95;
        // Declares a double variable for Physics mark

        double chemistrymark = 96;
        // Declares a double variable for Chemistry mark

        double averagemark = (mathsmark + physicsmark + chemistrymark) / 3;
        // Calculates the average of the three subject marks

        System.out.print(name + "'s average mark in PCM is " + averagemark);
        // Prints the result in a single line
    }
}
