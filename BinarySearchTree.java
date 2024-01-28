package LearningModule;

import java.util.Scanner;

class Node {
    int value;
    Node left;
    Node right;

    // Constructor
    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTree {
    Node root;

    // Constructor with a parameter for the root value
    public BinaryTree(int rootValue) {
        this.root = new Node(rootValue);
    }

    // Method for inserting into the binary tree
    public void insert(int value) {
        root = insertValue(root, value);
    }

    // Recursive method for inserting a value into the binary tree
    private Node insertValue(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        // Nested condition for determining the position of the value
        if (value < current.value) {
            current.left = insertValue(current.left, value);
        } else {
            current.right = insertValue(current.right, value);
        }
        return current;
    }

    // Method to perform in-order traversal starting from the root
    public void performInOrderTraversal() {
        inOrderTraversal(root);
    }

    // Recursive method for in-order traversal
    private void inOrderTraversal(Node current) {
        if (current != null) {
            inOrderTraversal(current.left);
            System.out.print(current.value + " ");
            inOrderTraversal(current.right);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the root value: ");
        int rootValue = scanner.nextInt();
        BinaryTree binaryTree = new BinaryTree(rootValue);

        System.out.println("Enter the number of nodes: ");
        int numNodes = scanner.nextInt();

        for (int i = 0; i < numNodes; i++) {
            System.out.println("Enter element " + (i + 1) + ": ");
            int nodeValue = scanner.nextInt();
            binaryTree.insert(nodeValue);
        }

        System.out.println("In-Order Traversal: ");
        binaryTree.performInOrderTraversal();

        scanner.close();
    }
}
