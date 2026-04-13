package linkedlist;

// Node class representing a user
class UserNode {

    // User details
    int id;
    String name;
    int age;

    // Array to store friend IDs (max 10 friends)
    int[] friends = new int[10];

    // Count of friends added
    int count = 0;

    // Pointer to next user
    UserNode next;

    // Constructor to initialize user
    UserNode(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}

// Main class for Social Media system
public class SocialMedia {

    // Head of linked list
    UserNode head;

    void addUser(int id, String name, int age) {

        // Create new user node
        UserNode newNode = new UserNode(id, name, age);

        // If list is empty
        if (head == null) {
            head = newNode;
            return;
        }

        // Traverse to end
        UserNode temp = head;

        while (temp.next != null)
            temp = temp.next;

        // Add user at end
        temp.next = newNode;
    }

    void addFriend(int userId, int friendId) {

        // Traverse users
        UserNode temp = head;

        while (temp != null) {

            // Find user
            if (temp.id == userId) {

                // Add friend ID to array
                temp.friends[temp.count++] = friendId;
                return;
            }

            temp = temp.next;
        }
    }

    void displayFriends(int userId) {

        // Traverse users
        UserNode temp = head;

        while (temp != null) {

            // Find user
            if (temp.id == userId) {

                // Display all friends
                for (int i = 0; i < temp.count; i++)
                    System.out.println("Friend ID: " + temp.friends[i]);

                return;
            }

            temp = temp.next;
        }
    }

    void searchUser(int id) {

        // Traverse list
        UserNode temp = head;

        while (temp != null) {

            // If user found
            if (temp.id == id) {
                System.out.println("User Found: " + temp.name);
                return;
            }

            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        // Create SocialMedia system
        SocialMedia s = new SocialMedia();

        // Add users
        s.addUser(1, "Arun", 20);
        s.addUser(2, "Rahul", 21);

        // Add friendship
        s.addFriend(1, 2);

        // Display friends of user 1
        s.displayFriends(1);
    }
}