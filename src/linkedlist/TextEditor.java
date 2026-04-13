package linkedlist;

// Node class representing each state of text
class StateNode {

    // Text content at this state
    String text;

    // Pointers for doubly linked list (undo/redo)
    StateNode prev, next;

    // Constructor to initialize text state
    StateNode(String text) {
        this.text = text;
    }
}

// Main class for Text Editor (Undo/Redo system)
public class TextEditor {

    // Pointer to current state
    StateNode current;

    void type(String text) {

        // Create new state node
        StateNode newNode = new StateNode(text);

        // If current exists, link next
        if (current != null)
            current.next = newNode;

        // Set previous link
        newNode.prev = current;

        // Move current to new state
        current = newNode;
    }

    void undo() {

        // Move to previous state if exists
        if (current.prev != null)
            current = current.prev;

        // Display current state after undo
        System.out.println("Undo: " + current.text);
    }

    void redo() {

        // Move to next state if exists
        if (current.next != null)
            current = current.next;

        // Display current state after redo
        System.out.println("Redo: " + current.text);
    }

    void display() {

        // Show current text
        System.out.println("Current Text: " + current.text);
    }

    public static void main(String[] args) {

        // Create TextEditor
        TextEditor t = new TextEditor();

        // Type text (creates states)
        t.type("Hello");
        t.type("Hello World");

        // Display current text
        t.display();

        // Undo operation
        t.undo();

        // Redo operation
        t.redo();
    }
}