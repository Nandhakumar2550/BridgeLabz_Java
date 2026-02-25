package method_practice.level3;
import java.util.Random;
public class ZaraPayroll {
    public static double[][] generateEmployeeData(int size) {

        double[][] data = new double[size][2]; // Salary, Years
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            data[i][0] = 10000 + random.nextInt(90000); // 5 digit salary
            data[i][1] = 1 + random.nextInt(10); // 1–10 years
        }
        return data;
    }

    public static double[][] calculateBonus(double[][] data) {

        double[][] result = new double[data.length][2]; // NewSalary, Bonus

        for (int i = 0; i < data.length; i++) {

            double salary = data[i][0];
            double years = data[i][1];

            double bonus = (years > 5) ? salary * 0.05 : salary * 0.02;
            double newSalary = salary + bonus;

            result[i][0] = newSalary;
            result[i][1] = bonus;
        }
        return result;
    }

    public static void displaySummary(double[][] oldData, double[][] newData) {

        double totalOld = 0, totalNew = 0, totalBonus = 0;

        System.out.println("Emp\tOldSalary\tYears\tBonus\tNewSalary");

        for (int i = 0; i < oldData.length; i++) {

            totalOld += oldData[i][0];
            totalNew += newData[i][0];
            totalBonus += newData[i][1];

            System.out.println((i+1) + "\t" +
                    oldData[i][0] + "\t\t" +
                    oldData[i][1] + "\t" +
                    newData[i][1] + "\t" +
                    newData[i][0]);
        }

        System.out.println("\nTotal Old Salary: " + totalOld);
        System.out.println("Total Bonus: " + totalBonus);
        System.out.println("Total New Salary: " + totalNew);
    }

    public static void main(String[] args) {

        int size = 10;

        double[][] employeeData = generateEmployeeData(size);
        double[][] updatedData = calculateBonus(employeeData);

        displaySummary(employeeData, updatedData);
    }
}
