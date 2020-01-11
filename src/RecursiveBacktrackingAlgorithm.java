import java.util.Set;
import java.util.Stack;
import java.util.stream.Collectors;

public class RecursiveBacktrackingAlgorithm<V> implements Algorithm<V> {

    private Graph<V> graph;

    private UnweightedGraph<V> maze;

    private Stack<V> vertices;

    public RecursiveBacktrackingAlgorithm(Graph<V> graph) {
        this.graph = graph;

        this.maze = new UndirectedUnweightedGraph<>();
    }

    @Override
    public Graph<V> generateMaze() {

        V origin = graph.getVertices().iterator().next();

        generateMazeRecursively(origin);

        return maze;

    }

    private void generateMazeRecursively(V vertex) {

        maze.addVertex(vertex);

        Set<V> adjacentVertices = graph.getAdjacentVertices(vertex);

        for (V adjacentVertex : adjacentVertices) {

            if (!maze.containsVertex(adjacentVertex)) {

                generateMazeRecursively(adjacentVertex);

                maze.addEdge(vertex, adjacentVertex);
            }

        }

    }
}
