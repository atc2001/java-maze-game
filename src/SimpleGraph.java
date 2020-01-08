import java.util.*;

public class SimpleGraph<V> implements UnweightedGraph<V> {
    
    private Map<V, List<V>> _vertices;

    public SimpleGraph() {
        _vertices = new HashMap<>();
    }

    @Override
    public Set<V> vertices() {
        return _vertices.keySet();
    }

    @Override
    public void addVertex(V vertex) {
        _vertices.putIfAbsent(vertex, new ArrayList<>());
    }

    @Override
    public void addEdge(V origin, V destination) {
        _vertices.get(origin).add(destination);
        _vertices.get(destination).add(origin);
        
    }
}
