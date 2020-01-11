import java.util.Iterator;
import java.util.Set;

public class UndirectedUnweightedPath<V> implements UnweightedPath<V> {

    private final V origin;

    private final V destination;

    private final Set<V> vertices;

    public UndirectedUnweightedPath(V origin, V destination, Set<V> vertices) {
        this.origin = origin;
        this.destination = destination;
        this.vertices = vertices;
    }

    @Override
    public V getOrigin() {
        return origin;
    }

    @Override
    public V getDestination() {
        return destination;
    }

    @Override
    public Set<V> getVertices() {
        return vertices;
    }

    @Override
    public Iterator<V> iterator() {
        return vertices.iterator();
    }
}
