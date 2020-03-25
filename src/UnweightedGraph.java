public interface UnweightedGraph<V> extends Graph<V> {

    /**
     * Adds an edge to the unweighted graph.
     *
     * @param origin      the origin vertex of the edge
     * @param destination the destination vertex of the edge
     */
    void addEdge(V origin, V destination);
}
