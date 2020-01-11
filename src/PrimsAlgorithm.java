import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class PrimsAlgorithm<V> implements Algorithm<V> {

    private final Graph<V> graph;

    private final UnweightedGraph<V> maze;

    public PrimsAlgorithm(Graph<V> graph) {
        this.graph = graph;

        this.maze = new UndirectedUnweightedGraph<>();
    }

    @Override
    public Graph<V> generateMaze() {

        V vertex = graph.getRandomVertex();

        maze.addVertex(vertex);

        while (maze.getVertices().size() < graph.getVertices().size()) {

            List<EndpointPair<V>> endpointPairs = new ArrayList<>();

            for (V origin : maze.getVertices()) {

                List<EndpointPair<V>> list = graph.getAdjacentVertices(origin).stream().filter(destination -> !maze.containsVertex(destination)).map(destination -> new UndirectedUnweightedEndpointPair<V>(origin, destination)).collect(Collectors.toList());

                endpointPairs.addAll(list);
            }

            Collections.shuffle(endpointPairs);

            int index = new Random().nextInt(endpointPairs.size());

            EndpointPair<V> endpointPair = endpointPairs.get(index);

            maze.addVertex(endpointPair.getDestination());
            maze.addEdge(endpointPair.getOrigin(), endpointPair.getDestination());
        }

        return maze;
    }

}
