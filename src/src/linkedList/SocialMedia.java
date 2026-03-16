package linkedList;

class UserNode {

    int id;
    String name;
    int age;

    int[] friends = new int[10];
    int count = 0;

    UserNode next;

    UserNode(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}

public class SocialMedia {

    UserNode head;

    void addUser(int id, String name, int age) {

        UserNode newNode = new UserNode(id, name, age);

        if (head == null) {
            head = newNode;
            return;
        }

        UserNode temp = head;

        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
    }

    void addFriend(int userId, int friendId) {

        UserNode temp = head;

        while (temp != null) {

            if (temp.id == userId) {
                temp.friends[temp.count++] = friendId;
                return;
            }

            temp = temp.next;
        }
    }

    void displayFriends(int userId) {

        UserNode temp = head;

        while (temp != null) {

            if (temp.id == userId) {

                for (int i = 0; i < temp.count; i++)
                    System.out.println("Friend ID: " + temp.friends[i]);

                return;
            }

            temp = temp.next;
        }
    }

    void searchUser(int id) {

        UserNode temp = head;

        while (temp != null) {

            if (temp.id == id) {
                System.out.println("User Found: " + temp.name);
                return;
            }

            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        SocialMedia s = new SocialMedia();

        s.addUser(1, "Arun", 20);
        s.addUser(2, "Rahul", 21);

        s.addFriend(1, 2);

        s.displayFriends(1);
    }
}
