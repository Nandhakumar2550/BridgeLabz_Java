package linkedlist;

class StateNode {

    String text;
    StateNode prev, next;

    StateNode(String text) {
        this.text = text;
    }
}

public class TextEditor {

    StateNode current;

    void type(String text) {

        StateNode newNode = new StateNode(text);

        if (current != null)
            current.next = newNode;

        newNode.prev = current;
        current = newNode;
    }

    void undo() {

        if (current.prev != null)
            current = current.prev;

        System.out.println("Undo: " + current.text);
    }

    void redo() {

        if (current.next != null)
            current = current.next;

        System.out.println("Redo: " + current.text);
    }

    void display() {
        System.out.println("Current Text: " + current.text);
    }

    public static void main(String[] args) {

        TextEditor t = new TextEditor();

        t.type("Hello");
        t.type("Hello World");

        t.display();

        t.undo();

        t.redo();
    }
}
