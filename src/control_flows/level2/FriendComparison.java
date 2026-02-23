package control_flows.level2;
import java.util.*;
public class FriendComparison {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the age of Amar");
        int ageAmar=scan.nextInt();
        System.out.println("Enter the age of Akbar");
        int ageAkbar=scan.nextInt();
        System.out.println("Enter the age of Anthony");
        int ageAnthony=scan.nextInt();
        System.out.println("Enter the height of Amar");
        double heightAmar=scan.nextDouble();
        System.out.println("Enter the height of Akbar");
        double heightAkbar=scan.nextDouble();
        System.out.println("Enter the height Anthony");
        double heightAnthony=scan.nextDouble();

        if(ageAmar<ageAkbar && ageAmar<ageAnthony){
            System.out.println("Amar is the youngest");
        }else if(ageAkbar<ageAmar && ageAkbar<ageAnthony){
            System.out.println("Akbar is the youngest");
        }else{
            System.out.println("Anthony is the youngest");
        }

        if(heightAmar>heightAkbar && heightAmar>heightAnthony){
            System.out.println("Amar is the Tallest");
        }else if(heightAkbar>heightAmar && heightAkbar>heightAnthony ){
            System.out.println("Akbar is the Tallest");
        }else{
            System.out.println("Anthony is the Tallest");
        }
        scan.close();
    }
}
