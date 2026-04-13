package programming_elements.level1;

public class Dividepens {
    public static void main(String args[]){

        int totalpens = 14;
        // Total number of pens available

        int totalstudents = 3;
        // Total number of students

        int pensperstudent = totalpens / totalstudents;
        // Calculates how many pens each student gets (integer division)

        int remainingpens = totalpens % totalstudents;
        // Calculates leftover pens using modulus operator

        System.out.print("The Pen Per Student is " + pensperstudent +
                " and the remaining pen not distributed is " + remainingpens);
        // Displays the result
    }
}