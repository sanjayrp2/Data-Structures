package Study;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearchGraph {
    private int vertices; // Number of vertices
    private LinkedList<Integer>[] adjacencyList; // Adjacency list representation

    public BreadthFirstSearchGraph(int vertices) {
        this.vertices = vertices;
        adjacencyList = new LinkedList[vertices];
        for (int i = 0; i < vertices; ++i)
            adjacencyList[i] = new LinkedList<>();
    }

    // Function to add an edge to the graph
    void addEdge(int v, int w) {
        adjacencyList[v].add(w);
    }

    // Function for BFS traversal
    void BFS(int startVertex) {
        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>(); // Create a queue for BFS

        visited[startVertex] = true;
        queue.add(startVertex);

        while (!queue.isEmpty()) {
            startVertex = queue.poll();
            System.out.print(startVertex + " ");

            // Loop for searching the adjacent vertices
            for (int neighbor : adjacencyList[startVertex]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    // main
    public static void main(String[] args) {
        BreadthFirstSearchGraph graph = new BreadthFirstSearchGraph(4);
        graph.addEdge(0, 1);
        graph.addEdge(0, 3);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 1);

        System.out.println("Starting vertex:");
        graph.BFS(2);
    }
}
