package Study;
import java.util.ArrayList;
import java.util.List;

class DirectedGraph {
    private int numVertices;
    private List<List<Integer>> adjacencyList;

    // Constructor
    public DirectedGraph(int numVertices) {
        this.numVertices = numVertices;
        this.adjacencyList = new ArrayList<>(numVertices);

        // Loop for the number of vertices
        for (int i = 0; i < numVertices; i++) {
            this.adjacencyList.add(new ArrayList<>());
        }
    }

    public void addEdges(int source, int destination) {
        // Directed graph
        this.adjacencyList.get(source).add(destination);
    }

    // Method to print the graph
    public void printGraph() {
        System.out.println("Graph: ");
        for (int i = 0; i < numVertices; i++) {
            System.out.print("Vertex " + i + ": ");

            // For-each loop for encapsulation
            for (Integer adjacentVertex : adjacencyList.get(i)) {
                System.out.print(adjacentVertex + " ");
            }

            System.out.println();
        }
    }
}

// Main class
public class DirectedGraphExample {
    public static void main(String[] args) {
        // Object for the DirectedGraph class
        DirectedGraph graph = new DirectedGraph(5);

        // Adding edges
        graph.addEdges(1, 3);
        graph.addEdges(0, 2);
        graph.addEdges(1, 4);
        graph.addEdges(0, 4);
        graph.addEdges(2, 3);

        // Invoking the method to print the graph
        graph.printGraph();
    }
}
