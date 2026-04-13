package method_practice.level2;
import java.util.*;

class Friend {
    String name;
    int age;
    double height;

    Friend(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
}

public class FriendAnalyzerMethod {

    public static Friend findYoungest(Friend[] friends){
        Friend youngest = friends[0];
        // Assume first friend is youngest

        for(Friend f : friends){
            if(f.age < youngest.age){
                youngest = f;
                // Update youngest
            }
        }
        return youngest;
    }

    public static Friend findTallest(Friend[] friends){
        Friend tallest = friends[0];
        // Assume first friend is tallest

        for(Friend f : friends){
            if(f.height > tallest.height){
                tallest = f;
                // Update tallest
            }
        }
        return tallest;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        Friend[] friends = new Friend[3];

        for(int i = 0; i < friends.length; i++){

            System.out.println("Enter age of " + names[i]);
            int age = scan.nextInt();

            System.out.println("Enter height of " + names[i]);
            double height = scan.nextDouble();

            friends[i] = new Friend(names[i], age, height);
            // Create object
        }

        Friend youngest = findYoungest(friends);
        Friend tallest = findTallest(friends);

        System.out.println("Youngest: " + youngest.name + " (" + youngest.age + ")");
        System.out.println("Tallest: " + tallest.name + " (" + tallest.height + ")");

        scan.close();
    }
}