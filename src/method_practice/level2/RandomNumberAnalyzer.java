package method_practice.level2;

public class RandomNumberAnalyzer {

    public static int[] generate4DigitRandomArray(int size){

        int[] numbers = new int[size];
        // Creates array to store random numbers

        for(int i = 0; i < size; i++){

            numbers[i] = 1000 + (int)(Math.random() * 9000);
            // Generates random 4-digit number (1000–9999)
        }

        return numbers;
        // Returns array of random numbers
    }

    public static double[] findAverageMinMax(int[] numbers) {

        int sum = 0;
        // Initializes sum

        int min = numbers[0];
        // Assumes first element is minimum

        int max = numbers[0];
        // Assumes first element is maximum

        for(int i = 0; i < numbers.length; i++){

            sum += numbers[i];
            // Adds each number to sum

            min = Math.min(min, numbers[i]);
            // Updates minimum

            max = Math.max(max, numbers[i]);
            // Updates maximum
        }

        return new double[]{sum, min, max};
        // Returns sum, min, and max
    }

    public static void main(String args[]) {

        int size = 5;
        // Number of random values

        int[] randomNumbers = generate4DigitRandomArray(size);
        // Generates random numbers

        System.out.println("Generated Numbers:");
        // Prints heading

        for (int num : randomNumbers)
            System.out.println(num);
        // Prints each number

        double[] results = findAverageMinMax(randomNumbers);
        // Calls method

        System.out.println("Average = " + results[0]);


        System.out.println("Minimum = " + (int)results[1]);
        // Prints minimum

        System.out.println("Maximum = " + (int)results[2]);
        // Prints maximum
    }
}