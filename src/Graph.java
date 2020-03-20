import java.util.Set;

public interface Graph<V> {

    /**
     * Gets all the vertices of the graph.
     *
     * @return all the vertices of the graph
     */
    Set<V> getVertices();

    /**
     * Adds a vertex to the graph.
     *
     * @param vertex the vertex to add to the graph
     */
    void addVertex(V vertex);

    /**
     * Gets all the vertices that are adjacent to a vertex.
     *
     * @param vertex the vertex to get the adjacent vertices of
     * @return all the vertices that are adjacent to the vertex
     */
    Set<V> getAdjacentVertices(V vertex);

    /**
     * Returns true if the graph contains a vertex; otherwise, false.
     *
     * @param vertex the vertex to check the graph for
     * @return true if the graph contains a vertex; otherwise, false
     */
    boolean containsVertex(V vertex);

    /**
     * Gets a random vertex of the graph.
     *
     * @return the random vertex of the graph
     */
    V getRandomVertex();

    /**
     * Gets all the endpoint pairs of the graph.
     *
     * @return all the endpoint pairs of the graph
     */
    Set<EndpointPair<V>> getEndpointPairs();
}
