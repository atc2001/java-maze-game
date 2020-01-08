import java.util.Set;

public interface Graph<V> {

    Set<V> getVertices();

    void addVertex(V vertex);

}
