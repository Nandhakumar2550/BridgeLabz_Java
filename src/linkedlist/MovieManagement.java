package linkedlist;

class MovieNode {

    String title;
    String director;
    int year;
    double rating;

    MovieNode next, prev;

    MovieNode(String t, String d, int y, double r) {
        title = t;
        director = d;
        year = y;
        rating = r;
    }
}

public class MovieManagement {

    MovieNode head, tail;

    void addEnd(String t, String d, int y, double r) {

        MovieNode newNode = new MovieNode(t, d, y, r);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    void remove(String title) {

        MovieNode temp = head;

        while (temp != null) {

            if (temp.title.equals(title)) {

                if (temp.prev != null)
                    temp.prev.next = temp.next;
                else
                    head = temp.next;

                if (temp.next != null)
                    temp.next.prev = temp.prev;
                else
                    tail = temp.prev;

                return;
            }

            temp = temp.next;
        }
    }

    void searchDirector(String director) {

        MovieNode temp = head;

        while (temp != null) {
            if (temp.director.equals(director))
                System.out.println(temp.title);

            temp = temp.next;
        }
    }

    void displayForward() {

        MovieNode temp = head;

        while (temp != null) {
            System.out.println(temp.title + " " + temp.rating);
            temp = temp.next;
        }
    }

    void displayReverse() {

        MovieNode temp = tail;

        while (temp != null) {
            System.out.println(temp.title);
            temp = temp.prev;
        }
    }

    public static void main(String[] args) {

        MovieManagement m = new MovieManagement();

        m.addEnd("Inception", "Nolan", 2010, 9);
        m.addEnd("Avatar", "Cameron", 2009, 8.5);

        m.displayForward();

        System.out.println("Reverse:");
        m.displayReverse();
    }
}
