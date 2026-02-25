package method_practice.level2;
import java.util.*;
public class FriendAnalyzerMethod {
    public static int findYoungest(int[] age){
        int young=0;
        for(int i=1;i<age.length;i++){
            if(age[young]>age[i]){
                young=i;
            }
        }
        return young;
    }
    public static int findTallest(double[] height){
        int index=0;
        for(int i=1;i<height.length;i++){
            if(height[index]<height[i]){
                index=i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String[] names={"Amar", "Akbar", "Anthony"};
        int[] age=new int[3];
        double[] height=new double[3];
        for(int i=0;i<age.length;i++){
            System.out.println("Enter the age " + names[i] + " :");
            age[i]=scan.nextInt();
        }
        for(int i=0;i<height.length;i++){
            System.out.println("Enter the height " + height[i] + " :");
            height[i]=scan.nextDouble();
        }
        int youngestIndex = findYoungest(age);
        int tallestIndex = findTallest(height);

        System.out.println("Youngest: " +  names[youngestIndex]);
        System.out.println("Tallest: " + names[tallestIndex]);
    }
}
