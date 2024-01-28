package Study;
import java.util.ArrayList;
import java.util.List;

class GraphRepresentation {
    private int numVertices;
    private List<List<Integer>> adjacencyList;

    // Constructor
    public GraphRepresentation(int numVertices) {
        this.numVertices = numVertices;
        adjacencyList = new ArrayList<>(numVertices);

        // Loop for the number of vertices
        for (int i = 0; i < numVertices; i++) {
            adjacencyList.add(new ArrayList<>());
        }
    }

    // Method to add edges in an undirected graph
    public void addEdges(int source, int destination) {
        adjacencyList.get(source).add(destination);
        adjacencyList.get(destination).add(source);
    }

    // Method to print the graph representation
    public void printGraph() {
        System.out.println("Graph Representation:");

        // Loop to check adjacent vertices
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
public class ArrayGraph {
    public static void main(String[] args) {
        // Create an instance of the GraphRepresentation class
        GraphRepresentation graph = new GraphRepresentation(5);

        // Add edges to the graph
        graph.addEdges(1, 3);
        graph.addEdges(0, 2);
        graph.addEdges(1, 4);
        graph.addEdges(0, 4);
        graph.addEdges(2, 3);

        // Print the graph representation
        graph.printGraph();
    }
}