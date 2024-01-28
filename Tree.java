package Study;
import java.util.Scanner;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    // Constructor
    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTree {
    TreeNode root;

    // Constructor using the main class passing the parameter
    public BinaryTree(int rootData) {
        // This object is for the tree node and for data
        this.root = new TreeNode(rootData);
    }

    // Method for invoking insert
    public void insert(int data) {
        root = insertValue(root, data);
    }

    // Loop not needed for working overall
    private TreeNode insertValue(TreeNode root, int data) {
        if (root == null) {
            root = new TreeNode(data);
            return root;
        }

        if (data < root.data) {
            root.left = insertValue(root.left, data);
        } else {
            if (data > root.data) {
                root.right = insertValue(root.right, data);
            }
        }

        return root;
    }

    // Order
    // Preorder - RO L R
    // Inorder - L RO R
    // Postorder - L R RO

    // Root decides before allocation -> Pre-order
    public void inorderTraversal() {
        // To get the base for L & R i.e., root
        inorderTraversalValue(root); // It gets allocated
    }

    // Orderwise allocate
    private void inorderTraversalValue(TreeNode root) {
        if (root != null) {
            // Left
            inorderTraversalValue(root.left);
            // Root
            System.out.print(root.data + " ");
            // Right
            inorderTraversalValue(root.right);
        }
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the root value: ");
        int rootValue = scanner.nextInt();

        // Object
        BinaryTree binaryTree = new BinaryTree(rootValue);

        System.out.println("Enter the number of nodes: ");
        int numNodes = scanner.nextInt();

        // To run globally so that all the nodes are created and data implemented
        for (int i = 0; i < numNodes; i++) {
            System.out.println("Enter element " + (i + 1) + ": ");
            int nodeData = scanner.nextInt();
            binaryTree.insert(nodeData);
        }

        // Display the inorder traversal of the binary tree
        System.out.println("Inorder Traversal: ");
        binaryTree.inorderTraversal();
        scanner.close();
    }
}
