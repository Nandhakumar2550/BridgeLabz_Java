package method_practice.level2;

public class RandomNumberAnalyzer {
    public static int[] generate4DigitRandomArray(int size){
        int[] numbers = new int[size];
        for(int i=0;i<size;i++){
            numbers[i]=1000+(int)(Math.random()*9000);
        }
        return numbers;
    }
    public static double[] findAverageMinMax(int[] numbers) {
        int sum=0;
        int min=numbers[0];
        int max=numbers[0];
        for(int i=0;i<numbers.length;i++){
            sum +=numbers[i];
            min=Math.min(min,numbers[i]);
            max=Math.max(max,numbers[i]);
        }
        return new double[]{sum,min,max};
    }

        public static void main(String args[]) {
        int size = 5;
        int[] randomNumbers = generate4DigitRandomArray(size);
        System.out.println("Generated Numbers:");
        for (int num : randomNumbers)
            System.out.println(num);
        double[] results = findAverageMinMax(randomNumbers);

        System.out.println("Average = " + results[0]);
        System.out.println("Minimum = " + (int)results[1]);
        System.out.println("Maximum = " + (int)results[2]);
    }
}
