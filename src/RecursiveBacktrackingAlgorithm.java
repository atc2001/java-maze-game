import java.util.*;
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

        V origin = graph.getRandomVertex();

        generateMazeRecursively(origin);

        return maze;

    }

    private void generateMazeRecursively(V vertex) {

        maze.addVertex(vertex);

        List<V> adjacentVertices = new ArrayList<>(graph.getAdjacentVertices(vertex));

        Collections.shuffle(adjacentVertices);

        for (V adjacentVertex : adjacentVertices) {

            if (!maze.containsVertex(adjacentVertex)) {

                generateMazeRecursively(adjacentVertex);

                maze.addEdge(vertex, adjacentVertex);
            }

        }

    }
}
