import java.util.Set;

public interface Graph<V> {

    Set<V> vertices();

    void addVertex(V vertex);

}
