import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KruskalsAlgorithm<V> implements Algorithm<V> {

    private final Graph<V> graph;

    private final UnweightedGraph<V> maze;

    public KruskalsAlgorithm(Graph<V> graph) {
        this.graph = graph;

        this.maze = new UndirectedUnweightedGraph<>();

        for (V vertex : graph.getVertices()) {
            this.maze.addVertex(vertex);
        }

    }

    @Override
    public Graph<V> generateMaze() {

        List<EndpointPair<V>> endpointPairs = new ArrayList<>(graph.getEndpointPairs());

        Collections.shuffle(endpointPairs);

        UnionFind<V> forest = new UnionFind<>(graph.getVertices());

        for (EndpointPair<V> endpointPair : endpointPairs) {
            V origin = endpointPair.getOrigin();
            V destination = endpointPair.getDestination();

            if (forest.find(origin) == forest.find(destination)) continue;

            forest.union(origin, destination);

            maze.addEdge(origin, destination);

        }

        return maze;
    }
}
