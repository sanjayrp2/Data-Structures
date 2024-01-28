package LearningModule;

class Node2 {
    int data;
    Node2 next;

    public Node2(int data) {
        this.data = data;
        this.next = null;
    }
}

class CustomLinkedList {
    Node2 head;

    public CustomLinkedList() {
        this.head = null;
    }

    // Method to insert a new node at the beginning of the linked list
    public void prepend(int data) {
        Node2 newNode = new Node2(data);

        newNode.next = head;
        head = newNode;
    }

    // Method to display the linked list
    public void display() {
        Node2 current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class LinkedListExample2 {
    public static void main(String[] args) {
        CustomLinkedList linkedList = new CustomLinkedList();

        // Adding elements to the linked list
        linkedList.prepend(1);
        linkedList.prepend(2);
        linkedList.prepend(3);
        linkedList.prepend(4);

        // Displaying the linked list
        System.out.println("Linked List Values: ");
        linkedList.display();
    }
}