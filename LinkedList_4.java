package LearningModule;

import java.util.Scanner;

class Node6 {
    int data;
    Node6 next;

    public Node6(int data) {
        this.data = data;
        this.next = null;
    }
}

class CustomLinkedList3 {
    Node6 head;

    public CustomLinkedList3() {
        this.head = null;
    }

    // Method to insert a new node at the end
    public void append(int data) {
        Node6 newNode = new Node6(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node6 current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Method to reverse the linked list
    public void reverse() {
        Node6 prev = null;
        Node6 current = head;
        Node6 next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    // Method to display the linked list
    public void display() {
        Node6 current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class LinkedListDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomLinkedList3 linkedList = new CustomLinkedList3();

        System.out.println("Enter the number of elements in the linked list:");
        int n = scanner.nextInt();

        System.out.println("Enter the elements of the linked list:");
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            linkedList.append(value);
        }

        // Displaying the linked list
        System.out.println("Linked List Values: ");
        linkedList.display();

        // Reverse the linked list
        System.out.println("Reversed Linked List Values: ");
        linkedList.reverse();
        linkedList.display();
        
        scanner.close();
    }
}
