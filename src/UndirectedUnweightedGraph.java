import java.util.*;

public class UndirectedUnweightedGraph<V> implements UnweightedGraph<V> {
    
    private Map<V, Set<V>> vertices;

    public UndirectedUnweightedGraph() {
        vertices = new HashMap<>();
    }

    @Override
    public Set<V> getVertices() {
        return vertices.keySet();
    }

    @Override
    public void addVertex(V vertex) {
        vertices.putIfAbsent(vertex, new HashSet<>());
    }

    @Override
    public Set<V> getAdjacentVertices(V vertex) {
        return vertices.get(vertex);
    }

    @Override
    public boolean containsVertex(V vertex) {
        return vertices.containsKey(vertex);
    }

    @Override
    public void addEdge(V origin, V destination) {
        vertices.get(origin).add(destination);
        vertices.get(destination).add(origin);
        
    }
}
