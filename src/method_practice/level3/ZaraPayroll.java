package method_practice.level3;
import java.util.Random;

public class ZaraPayroll {

    public static double[][] generateEmployeeData(int size) {

        double[][] data = new double[size][2];
        // Stores employee data: [0]=Salary, [1]=Years of experience

        Random random = new Random();
        // Creates Random object

        for (int i = 0; i < size; i++) {

            data[i][0] = 10000 + random.nextInt(90000);
            // Generates salary (10000–99999)

            data[i][1] = 1 + random.nextInt(10);
            // Generates experience (1–10 years)
        }

        return data;
        // Returns employee data
    }

    public static double[][] calculateBonus(double[][] data) {

        double[][] result = new double[data.length][2];
        // Stores [0]=New Salary, [1]=Bonus

        for (int i = 0; i < data.length; i++) {

            double salary = data[i][0];
            // Extracts salary

            double years = data[i][1];
            // Extracts experience

            double bonus = (years > 5) ? salary * 0.05 : salary * 0.02;
            // Applies bonus: >5 yrs → 5%, else 2%

            double newSalary = salary + bonus;
            // Calculates updated salary

            result[i][0] = newSalary;
            // Stores new salary

            result[i][1] = bonus;
            // Stores bonus amount
        }

        return result;
        // Returns updated data
    }

    public static void displaySummary(double[][] oldData, double[][] newData) {

        double totalOld = 0, totalNew = 0, totalBonus = 0;
        // Initializes totals

        System.out.println("Emp\tOldSalary\tYears\tBonus\tNewSalary");
        // Prints table header

        for (int i = 0; i < oldData.length; i++) {

            totalOld += oldData[i][0];
            // Accumulates old salary

            totalNew += newData[i][0];
            // Accumulates new salary

            totalBonus += newData[i][1];
            // Accumulates total bonus

            System.out.println((i+1) + "\t" +
                    oldData[i][0] + "\t\t" +
                    oldData[i][1] + "\t" +
                    newData[i][1] + "\t" +
                    newData[i][0]);
            // Displays employee details
        }

        System.out.println("\nTotal Old Salary: " + totalOld);
        // Displays total old salary

        System.out.println("Total Bonus: " + totalBonus);
        // Displays total bonus

        System.out.println("Total New Salary: " + totalNew);
        // Displays total updated salary
    }

    public static void main(String[] args) {

        int size = 10;
        // Number of employees

        double[][] employeeData = generateEmployeeData(size);
        // Generates employee records

        double[][] updatedData = calculateBonus(employeeData);
        // Calculates bonus and new salary

        displaySummary(employeeData, updatedData);
        // Displays final payroll summary
    }
}