package method_practice.level2;
import java.util.*;
public class BMIMethodProgram {
    public static void bmi(double[][] arr){
        for(int i=0;i<arr.length;i++){
           double heightcm= arr[i][0];
           double weight=arr[i][1];

           double heightm=heightcm/100;
           arr[i][2]=weight/(heightm*heightm);
        }
    }
    public static String[] findbmistatus(double[][] arr){
        String[] status=new String[arr.length];
        for(int i = 0; i < arr.length; i++) {

            double bmi = arr[i][2];

            if (bmi < 18.5)
                status[i] = "Underweight";
            else if (bmi < 25)
                status[i] = "Normal";
            else if (bmi < 30)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }

        return status;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double[][] arr=new double[10][3];
        for(int i=0;i<10;i++){
            System.out.println("Enter the height" + i+1);
            arr[i][0]=scan.nextDouble();
            System.out.println("Enter the weight" + i+1);
            arr[i][1]=scan.nextDouble();

            if(arr[i][0]<=0 || arr[i][1]<=0){
                System.out.println("Enter the valid number");
                i--;
            }
        }
        bmi(arr);
        String[] status=findbmistatus(arr);
        for(int i=0;i<arr.length;i++) {
            System.out.println("Person " + (i + 1) +
                    " Weight: " + arr[i][0] +
                    " Height: " + arr[i][1] +
                    " BMI: " + arr[i][2] +
                    " Status: " + status[i]);
        }
    }
}
