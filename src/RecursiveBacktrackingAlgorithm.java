import java.util.*;

/**
 * This code generates a maze using Recursive Backtracking algorithm.
 */

public class RecursiveBacktrackingAlgorithm<V> implements Algorithm<V> {

    private final Graph<V> graph;

    private final UnweightedGraph<V> maze;

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
