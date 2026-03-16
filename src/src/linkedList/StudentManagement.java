package linkedList;
class StudentNode {
        int roll;
        String name;
        int age;
        String grade;
        StudentNode next;

        StudentNode(int roll, String name, int age, String grade) {
            this.roll = roll;
            this.name = name;
            this.age = age;
            this.grade = grade;
            this.next = null;
        }
    }

    public class StudentManagement {

        StudentNode head;

        // Add at beginning
        void addFirst(int roll, String name, int age, String grade) {
            StudentNode newNode = new StudentNode(roll, name, age, grade);
            newNode.next = head;
            head = newNode;
        }

        // Add at end
        void addEnd(int roll, String name, int age, String grade) {
            StudentNode newNode = new StudentNode(roll, name, age, grade);

            if (head == null) {
                head = newNode;
                return;
            }

            StudentNode temp = head;
            while (temp.next != null)
                temp = temp.next;

            temp.next = newNode;
        }

        // Delete by roll number
        void delete(int roll) {
            StudentNode temp = head, prev = null;

            while (temp != null) {
                if (temp.roll == roll) {
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

        // Search
        void search(int roll) {
            StudentNode temp = head;

            while (temp != null) {
                if (temp.roll == roll) {
                    System.out.println("Found: " + temp.name);
                    return;
                }
                temp = temp.next;
            }
            System.out.println("Student not found");
        }

        // Update grade
        void updateGrade(int roll, String grade) {
            StudentNode temp = head;

            while (temp != null) {
                if (temp.roll == roll) {
                    temp.grade = grade;
                    return;
                }
                temp = temp.next;
            }
        }

        // Display
        void display() {
            StudentNode temp = head;

            while (temp != null) {
                System.out.println(temp.roll + " " + temp.name + " " + temp.age + " " + temp.grade);
                temp = temp.next;
            }
        }

        public static void main(String[] args) {

            StudentManagement list = new StudentManagement();

            list.addFirst(1, "Rahul", 20, "A");
            list.addEnd(2, "Arun", 21, "B");
            list.addEnd(3, "Kiran", 19, "C");

            list.display();

            list.updateGrade(2, "A+");

            System.out.println("After update:");
            list.display();

            list.delete(1);

            System.out.println("After delete:");
            list.display();
        }
    }

