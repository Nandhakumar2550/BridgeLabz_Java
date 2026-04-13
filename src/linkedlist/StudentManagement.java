package linkedlist;

// Node class representing a student
class StudentNode {

    // Student details
    int roll;
    String name;
    int age;
    String grade;

    // Pointer to next node
    StudentNode next;

    // Constructor to initialize student data
    StudentNode(int roll, String name, int age, String grade) {
        this.roll = roll;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}

// Main class for Student Management using Linked List
public class StudentManagement {

    // Head of the linked list
    StudentNode head;

    // Add at beginning
    void addFirst(int roll, String name, int age, String grade) {

        // Create new node
        StudentNode newNode = new StudentNode(roll, name, age, grade);

        // Point new node to current head
        newNode.next = head;

        // Update head
        head = newNode;
    }

    // Add at end
    void addEnd(int roll, String name, int age, String grade) {

        // Create new node
        StudentNode newNode = new StudentNode(roll, name, age, grade);

        // If list is empty
        if (head == null) {
            head = newNode;
            return;
        }

        // Traverse to last node
        StudentNode temp = head;
        while (temp.next != null)
            temp = temp.next;

        // Insert at end
        temp.next = newNode;
    }

    // Delete by roll number
    void delete(int roll) {

        // temp → current node, prev → previous node
        StudentNode temp = head, prev = null;

        while (temp != null) {

            // If student found
            if (temp.roll == roll) {

                // If deleting head node
                if (prev == null)
                    head = temp.next;
                else
                    prev.next = temp.next;

                return;
            }

            prev = temp;
            temp = temp.next;
        }
    }

    // Search student by roll number
    void search(int roll) {

        StudentNode temp = head;

        while (temp != null) {

            // If found
            if (temp.roll == roll) {
                System.out.println("Found: " + temp.name);
                return;
            }

            temp = temp.next;
        }

        // If not found
        System.out.println("Student not found");
    }

    // Update student grade
    void updateGrade(int roll, String grade) {

        StudentNode temp = head;

        while (temp != null) {

            // If student found
            if (temp.roll == roll) {
                temp.grade = grade;
                return;
            }

            temp = temp.next;
        }
    }

    // Display all students
    void display() {

        StudentNode temp = head;

        while (temp != null) {

            // Print student details
            System.out.println(temp.roll + " " + temp.name + " " + temp.age + " " + temp.grade);

            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        // Create StudentManagement system
        StudentManagement list = new StudentManagement();

        // Add students
        list.addFirst(1, "Rahul", 20, "A");
        list.addEnd(2, "Arun", 21, "B");
        list.addEnd(3, "Kiran", 19, "C");

        // Display list
        list.display();

        // Update grade
        list.updateGrade(2, "A+");

        System.out.println("After update:");
        list.display();

        // Delete a student
        list.delete(1);

        System.out.println("After delete:");
        list.display();
    }
}