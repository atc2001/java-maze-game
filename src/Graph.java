import java.util.Set;

public interface Graph<V> {

    Set<V> getVertices();

    void addVertex(V vertex);

    Set<V> getAdjacentVertices(V vertex);

    boolean containsVertex(V vertex);

    V getRandomVertex();

    Set<EndpointPair<V>> getEndpointPairs();
}
